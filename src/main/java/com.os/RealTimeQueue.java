package src.main.java.com.os;

import src.main.java.com.os.interfaces.IRealTimeQueue;

import java.util.LinkedList;
import java.util.Queue;

public class RealTimeQueue implements IRealTimeQueue {

    private Queue<Proses> realTimeQueue = new LinkedList<>();

    @Override
    public void addProses(Proses proses) {
        realTimeQueue.add(proses);
    }

    public void printQueue(){

        System.out.println("real time queue yazdiriliyor...");

        for (Proses proses : realTimeQueue) {



            System.out.print(String.format(String.valueOf(" |  oncelik      : " + proses.getOncelik()) ,20));


        }

        System.out.println("");

        for (Proses proses : realTimeQueue) {

            System.out.print(" |  varis zamani : " + String.format(String.valueOf(proses.getVarisZamani()) ,3));

        }

        System.out.println("");

        for (Proses proses : realTimeQueue) {

            System.out.print(" |  id           : " + String.format(String.valueOf(proses.getProsesId()) ,3));

        }

        System.out.println("");
        System.out.println("");

    }

    public int getQueueSize(){
        return realTimeQueue.size();
    }

    @Override
    public Proses getProses() {
        return realTimeQueue.peek();
    }

    @Override
    public void removeProses(Proses proses) {
        this.realTimeQueue.remove();
    }
}
