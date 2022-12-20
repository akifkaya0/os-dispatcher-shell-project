package src.main.java.com.os;

import src.main.java.com.os.interfaces.IJobDispatchList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JobDispatchList implements IJobDispatchList {

    private Queue<Proses> prosesList = new LinkedList<>();

    public LinkedList<Proses> getProsesByArrivalTime(int arrivalTime) {

        LinkedList<Proses> list =  new LinkedList<>();

            for (Object prosesObject : prosesList.toArray()) {

                Proses proses = Proses.class.cast(prosesObject);

                if (proses.getVarisZamani() == arrivalTime) {
                    list.add(proses);
                    this.prosesList.remove(proses);
                }

            }

            return list;

    }

    public int getProsesListSize() {
        return this.prosesList.size();
    }

    @Override
    public void addProcess(Proses proses) {

        this.prosesList.add(proses);

    }

    @Override
    public void removeProcess() {

    }


}
