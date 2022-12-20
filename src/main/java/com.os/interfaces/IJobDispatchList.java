package src.main.java.com.os.interfaces;

import src.main.java.com.os.Proses;

import java.util.LinkedList;
import java.util.List;

public interface IJobDispatchList {

    void addProcess(Proses proses);
    void removeProcess();
    public int getProsesListSize();
    public LinkedList<Proses> getProsesByArrivalTime(int arrivalTime);

}
