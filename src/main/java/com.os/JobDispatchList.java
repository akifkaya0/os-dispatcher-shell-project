package src.main.java.com.os;

import src.main.java.com.os.interfaces.IJobDispatchList;

import java.util.ArrayList;
import java.util.List;

public class JobDispatchList implements IJobDispatchList {

    private List<Proses> prosesList =new ArrayList<>();

    public List<Proses> getProsesList() {
        return prosesList;
    }

    @Override
    public void addProcess(Proses proses) {

        prosesList.add(proses);

    }

    @Override
    public void removeProcess() {

    }





}
