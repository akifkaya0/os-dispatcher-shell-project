package src.main.java.com.os;

import src.main.java.com.os.interfaces.IDispatcher;
import src.main.java.com.os.interfaces.IJobDispatchList;
import src.main.java.com.os.interfaces.IRealTimeQueue;
import src.main.java.com.os.interfaces.IUserJobQueue;


import java.util.LinkedList;
import java.util.Queue;


public class Dispatcher implements IDispatcher {

    IJobDispatchList jobDispatchList;

    IUserJobQueue userJobQueue;
    IRealTimeQueue realTimeQueue;

    public Dispatcher(IJobDispatchList jobDispatchList) {

        this.jobDispatchList=jobDispatchList;

        this.userJobQueue = new UserJobQueue();
        this.realTimeQueue = new RealTimeQueue();

    }

    public void calistir() throws InterruptedException {

        int seconds = 0;
        long startTime = System.currentTimeMillis();
        for (Proses proses : jobDispatchList.getProsesList()) {
            // int konrol=0;

            for (Proses proses2 : jobDispatchList.getProsesList()) {
                if (proses2.getVarisZamani() == seconds) {
                    // konrol++;
                    if (proses.getOncelik() == 0) {
                        realTimeQueue.addProses(proses);
                    } else
                        userJobQueue.addProses(proses);
                }
            }
            /*if(realTimeQueue.getSize()>0){

            }
            else*/

            Thread.sleep(1000);
            long endTime = System.currentTimeMillis();
            long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
            seconds = (int) estimatedTime / 1000; // saniyeye çevirmek için 1000'e bölüyoruz.

            //  System.out.println(konrol);
        }

    }


    }
