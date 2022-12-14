package src.main.java.com.os;

import src.main.java.com.os.interfaces.IDispatcher;
import src.main.java.com.os.interfaces.IFCFS;
import src.main.java.com.os.interfaces.IJobDispatchList;
import src.main.java.com.os.interfaces.IMultiLevelFeedbackQueue;



public class Dispatcher implements IDispatcher {

    IFCFS FCFSQueue = new FCFS();
    IMultiLevelFeedbackQueue multilevelFeedbackQueue = new MultilevelFeedbackQueue();

    IJobDispatchList jobDispatchList;

    public Dispatcher(IJobDispatchList jobDispatchList) {
        this.jobDispatchList=jobDispatchList;
    }

    public void yerlestir(){

        for (Proses proses : jobDispatchList.getProsesList()) {
            if(proses.getOncelik()==0){
                FCFSQueue.addProses(proses);
            }
            else
                multilevelFeedbackQueue.addProses(proses);
        }

    }


}
