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



}
