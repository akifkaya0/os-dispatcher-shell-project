package src.main.java.com.os.interfaces;

import src.main.java.com.os.Proses;

import java.util.Queue;

public interface IUserJobQueue {

    public void addProses(Proses proses);
    public void printQueue();
    public int getQueueSize();
    public Proses getProses();
    public void removeProses(Proses proses);
    public void transferProses(Proses proses);
    public Queue<Proses> getUserJobQueue1();
    public Queue<Proses> getUserJobQueue2();
    public Queue<Proses> getUserJobQueue3();
}
