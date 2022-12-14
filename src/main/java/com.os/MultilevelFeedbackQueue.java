package src.main.java.com.os;

import src.main.java.com.os.interfaces.IMultiLevelFeedbackQueue;
import java.util.LinkedList;
import java.util.Queue;

public class MultilevelFeedbackQueue implements IMultiLevelFeedbackQueue {

    private Queue<Proses> multilevelFeedbackQueue = new LinkedList<>();

    public void addProses(Proses proses){
        multilevelFeedbackQueue.add(proses);
    }

    public void removeProses(){

    }

}
