package src.main.java.com.os;

import src.main.java.com.os.interfaces.IDispatcher;
import src.main.java.com.os.interfaces.IJobDispatchList;
import src.main.java.com.os.interfaces.IRealTimeQueue;
import src.main.java.com.os.interfaces.IUserJobQueue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;


public class Dispatcher implements IDispatcher {

    IJobDispatchList jobDispatchList;

    IUserJobQueue userJobQueue;
    IRealTimeQueue realTimeQueue;

    public Dispatcher(IJobDispatchList jobDispatchList) {

        this.jobDispatchList = jobDispatchList;

        this.userJobQueue = new UserJobQueue();
        this.realTimeQueue = new RealTimeQueue();

    }

    public void fetchProcess() {

        // programın başlangıç zamanını verir
        long startTime = System.currentTimeMillis();
        System.out.println("uygulama başlangıç zamanı : " + startTime);

        Timer myTimer = new Timer();
        TimerTask gorev = new TimerTask() {

            @Override
            public void run() {

                if (jobDispatchList.getProsesListSize() != 0) {

                    long endTime = System.currentTimeMillis();
                    long estimatedTime = endTime - startTime;
                    int dispatcherTime = (int) estimatedTime / 1000;

                    //System.out.println("dispatcher time : " + dispatcherTime + " jobDispatchList den prosesler getiriliyor");

                    LinkedList<Proses> prosesList = jobDispatchList.getProsesByArrivalTime(dispatcherTime);

                    for (Proses proses : prosesList) {

                        if (proses.getOncelik() == 0) {
                            realTimeQueue.addProses(proses);
                            //System.out.println("real time kuyruguna proses eklendi " + "id : " + proses.getProsesId() + " oncelik : " + proses.getOncelik());
                        } else {
                            userJobQueue.addProses(proses);
                            //System.out.println("user job kuyruguna proses eklendi " + "id : " + proses.getProsesId() + " oncelik : " + proses.getOncelik());
                        }
                    }

                } else {
                    myTimer.cancel();
                }

            }
        };

        myTimer.schedule(gorev, 0, 1000);

    }

    public void calistir() throws InterruptedException {

        int seconds = 0;
        long startTime = System.currentTimeMillis();

        this.fetchProcess();

        Proses islenmisProses = null;
        Proses islenecekProses = null;
        Thread.sleep(100);

        while (true) {

            islenecekProses = this.getProses();

            if (islenecekProses == null && this.jobDispatchList.getProsesListSize() == 0) break;

            // program ilk prosesi başlattığında ekrana başladı yazdırılır.
            if (islenmisProses == null) {

                islenecekProses.printProses(seconds, "basladi");

            } else {

                // program daha önceden bir proses çalıştırmışsa ilk olarak çalışacak olan proses bir önceki adımda çalışan proses ile aynı mı diye bakılır.
                if (islenmisProses.getProsesId() == islenecekProses.getProsesId()) {
                    // aynı ise proses yürütülmeye devam edilir.
                    islenecekProses.printProses(seconds, "yurutuluyor");

                } else {
                    // farklı bir proses çalıştırılmaya başlanmışsa ya proses kesmeye uğramıştır ya da proses bitmiştir yeni bir proses çalıştırılmaya başlanacaktır.

                    // prosesi askıya almak için
                    if (islenecekProses.getOncelik() < islenmisProses.getOncelik()) {

                        islenmisProses.printProses(seconds, "askıda");
                        islenecekProses.printProses(seconds, "basladi");

                    } else {
                        // yeni bir proses başlangıcı belirtmek için
                        islenecekProses.printProses(seconds, "basladi");

                    }

                }


            }

            Thread.sleep(1000);

            islenmisProses = islenecekProses;
            islenecekProses = null;
            islenmisProses.setProsesZamani(islenmisProses.getProsesZamani() - 1);

            //long endTime = System.currentTimeMillis();
            //long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
            //seconds = (int) estimatedTime / 1000; // saniyeye çevirmek için 1000'e bölüyoruz.
            seconds++;

            // 1 sn çalıştırılan proses tamamlandıysa ait olduğu kuyruktan çıkarılır.
            if (islenmisProses.getProsesZamani() == 0) {

                if (islenmisProses.getOncelik() == 0)
                    realTimeQueue.removeProses(islenmisProses);
                else
                    userJobQueue.removeProses(islenmisProses);

                islenmisProses.printProses(seconds, "sonlandi");
                continue;
            }

            // 1 sn çalıştırılan proses hala bitmediyse ve önceliği 1 2 veya 3 ise önceliği düşürülüp uygun kuyruğa yerleştirilir.
            if (islenmisProses.getOncelik() > 0) {

                userJobQueue.transferProses(islenmisProses);

            }

            System.out.println(islenmisProses);

        }

    }

    private Proses getProses() {

        Proses proses = null;

        if (realTimeQueue.getQueueSize() > 0)
            proses = realTimeQueue.getProses();
        else
            proses = userJobQueue.getProses();

        return proses;
    }


}
