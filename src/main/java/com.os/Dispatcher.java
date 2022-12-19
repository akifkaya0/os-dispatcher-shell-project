package src.main.java.com.os;

import src.main.java.com.os.interfaces.IDispatcher;
import src.main.java.com.os.interfaces.IJobDispatchList;


import java.util.LinkedList;
import java.util.Queue;


public class Dispatcher implements IDispatcher {
    private Queue<Proses> realTimeQueue = new LinkedList<>();
    private Queue<Proses> userJobQueue = new LinkedList<>();


    IJobDispatchList jobDispatchList;

    public Dispatcher(IJobDispatchList jobDispatchList) {
        this.jobDispatchList=jobDispatchList;
    }

    public void yerlestir(){

        for (Proses proses : jobDispatchList.getProsesList()) {
            if(proses.getOncelik()==0){
                realTimeQueue.add(proses);
            }
            else
                userJobQueue.add(proses);
        }

    }
    public Queue<Proses> getRealTimeQueue() {
        return realTimeQueue;
    }

    public Queue<Proses> getUserJobQueue() {
        return userJobQueue;
    }



}
