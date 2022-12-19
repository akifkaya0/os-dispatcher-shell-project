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




}
