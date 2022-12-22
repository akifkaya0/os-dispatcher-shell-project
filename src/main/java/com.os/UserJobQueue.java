package src.main.java.com.os;

import src.main.java.com.os.interfaces.IUserJobQueue;

import java.util.LinkedList;
import java.util.Queue;

public class UserJobQueue implements IUserJobQueue {


    private Queue<Proses> userJobQueue1 = new LinkedList<Proses>();
    private Queue<Proses> userJobQueue2 = new LinkedList<Proses>();
    private Queue<Proses> userJobQueue3 = new LinkedList<Proses>();


    @Override
    public void addProses(Proses proses) {

        if(proses.getOncelik() == 1)
            userJobQueue1.add(proses);
        if(proses.getOncelik() == 2)
            userJobQueue2.add(proses);
        if(proses.getOncelik() == 3)
            userJobQueue3.add(proses);

    }
    public Queue<Proses> getUserJobQueue1() {
        return userJobQueue1;
    }

    public Queue<Proses> getUserJobQueue2() {
        return userJobQueue2;
    }

    public Queue<Proses> getUserJobQueue3() {
        return userJobQueue3;
    }


    @Override
    public void printQueue() {

        Queue<Proses> queue = null;

        for (int i = 0 ; i < 3 ; i++){

            System.out.println("user job queue " +i+" yazdiriliyor...");

            if(i == 0)
                queue = userJobQueue1;
            if(i == 1)
                queue = userJobQueue2;
            if(i == 2)
                queue = userJobQueue3;

            for (Proses proses : queue) {

                System.out.print(" |  oncelik      : " + proses.getOncelik());


            }

            System.out.println("");

            for (Proses proses : queue) {

                System.out.print(" |  varis zamani : " + proses.getVarisZamani());

            }

        }






    }

    public int getQueueSize(){
        return userJobQueue1.size();
    }

    @Override
    public Proses getProses() {

        if(userJobQueue1.size() > 0)
            return userJobQueue1.peek();

        if(userJobQueue2.size() > 0)
            return userJobQueue2.peek();

        if(userJobQueue3.size() > 0)
            return userJobQueue3.peek();

        return null;

    }

    public void removeProses(Proses proses){

        if(proses.getOncelik() == 3){
            this.userJobQueue3.remove(proses);
        }

        if(proses.getOncelik() == 2){
            this.userJobQueue2.remove(proses);
        }

        if(proses.getOncelik() == 1){
            this.userJobQueue1.remove(proses);
        }

    }

    public void transferProses(Proses proses){

        if(proses.getOncelik() == 3){
            this.userJobQueue3.remove(proses);
            this.userJobQueue3.add(proses);
        }

        if(proses.getOncelik() == 2){
            this.userJobQueue2.remove(proses);
            proses.setOncelik(proses.getOncelik()+1);
            this.userJobQueue3.add(proses);
        }

        if(proses.getOncelik() == 1){
            this.userJobQueue1.remove(proses);
            proses.setOncelik(proses.getOncelik()+1);
            this.userJobQueue2.add(proses);
        }

    }

}