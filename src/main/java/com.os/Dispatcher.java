package src.main.java.com.os;

import src.main.java.com.os.interfaces.IDispatcher;

import java.util.LinkedList;
import java.util.Queue;

public class Dispatcher implements IDispatcher {
    Queue<Proses> gercekZamanlıKuyruk = new LinkedList<>();
    Queue<Proses> kullanıcıProsesKuyruk = new LinkedList<>();


    JobDispatchList jobDispatchList;
    public Dispatcher(JobDispatchList jobDispatchList) {
        this.jobDispatchList=jobDispatchList;
    }
    public void yerlestir(){
        for (Proses jobDispatchList1 : jobDispatchList.proses) {
            if(jobDispatchList1.getOncelik()==0){
                gercekZamanlıKuyruk.add(jobDispatchList1);
            }
            else
                kullanıcıProsesKuyruk.add(jobDispatchList1);
        }
    }


}
