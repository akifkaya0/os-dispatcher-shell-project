package src.main.java.com.os;

import src.main.java.com.os.interfaces.IUserJobQueue;

import java.util.LinkedList;

public class UserJobQueue implements IUserJobQueue {

    private LinkedList<Proses>[] userJobQueue = new LinkedList[3];


    @Override
    public void addProses(Proses proses) {

        userJobQueue[proses.getOncelik() - 1].add(proses);

    }




}
