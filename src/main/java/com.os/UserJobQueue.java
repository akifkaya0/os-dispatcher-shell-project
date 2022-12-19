package src.main.java.com.os;

import src.main.java.com.os.interfaces.IUserJobQueue;

import java.util.LinkedList;
import java.util.Queue;

public class UserJobQueue implements IUserJobQueue {

    private Queue<Proses> userJobQueue = new LinkedList<Proses>();

    @Override
    public void addProses(Proses proses) {

        userJobQueue.add(proses);

    }

    @Override
    public void printQueue() {

        System.out.println("user job queue yazdiriliyor...");


        for (Proses proses : userJobQueue) {

            System.out.print(" |  oncelik      : " + proses.getOncelik());


        }

        System.out.println("");

        for (Proses proses : userJobQueue) {

            System.out.print(" |  varis zamani : " + proses.getVarisZamani());

        }

    }

}