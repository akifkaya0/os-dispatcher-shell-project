package src.main.java.com.os;

import src.main.java.com.os.interfaces.IFCFS;

import java.util.LinkedList;
import java.util.Queue;

public class FCFS implements IFCFS {

    private Queue<Proses> FCFSQueue = new LinkedList<>();

    public void addProses(Proses proses){
        FCFSQueue.add(proses);
    }

    public void removeProses(){

    }

}
