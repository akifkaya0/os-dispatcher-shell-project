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

    public void yerlestir(){

        for (Proses proses : jobDispatchList.getProsesList()) {
            if(proses.getOncelik()==0){
                realTimeQueue.addProses(proses);
            }
            else
                userJobQueue.addProses(proses);
        }

    }

}
