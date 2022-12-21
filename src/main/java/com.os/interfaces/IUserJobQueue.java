package src.main.java.com.os.interfaces;

import src.main.java.com.os.Proses;

public interface IUserJobQueue {

    public void addProses(Proses proses);
    public void printQueue();
    public int getQueueSize();
    public Proses getProses();
    public void removeProses(Proses proses);
    public void transferProses(Proses proses);
}
