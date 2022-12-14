package src.main.java.com.os.interfaces;

import src.main.java.com.os.Proses;

import java.util.List;

public interface IJobDispatchList {

    void addProcess(Proses proses);
    void removeProcess();

    public List<Proses> getProsesList();

}
