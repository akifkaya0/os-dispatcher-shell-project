package src.main.java.com.os;

public class Proses {

    private int prosesId;
    private int varisZamani;
    private int oncelik;
    private int prosesZamani;



    public Proses(int prosesId, int varisZamani, int oncelik, int prosesZamani) {
        this.varisZamani = varisZamani;
        this.oncelik = oncelik;
        this.prosesZamani = prosesZamani;
        this.prosesId = prosesId;

    }

    public void printProses(float dispatcherTimer , String printType){

        String information = String.format("%.4f", dispatcherTimer) + " sn proses " + printType;
        String processId = "(id:"+ String.format("%04d", this.getProsesId());
        String processOncelik = " öncelik:"+ this.getOncelik();
        String processArrivalTime = " kalan süre:"+ this.getProsesZamani() +" sn)";

        System.out.format("%20s  %10s  %10s  %10s  \n" , information, processId , processOncelik , processArrivalTime);

    }


    public int getVarisZamani() {
        return varisZamani;
    }

    public void setVarisZamani(int varisZamani) {
        this.varisZamani = varisZamani;
    }

    public int getOncelik() {
        return oncelik;
    }

    public void setOncelik(int oncelik) {
        this.oncelik = oncelik;
    }

    public int getProsesZamani() {
        return prosesZamani;
    }

    public void setProsesZamani(int prosesZamani) {
        this.prosesZamani = prosesZamani;
    }

    public int getProsesId() {
        return prosesId;
    }

    public void setProsesId(int prosesId) {
        this.prosesId = prosesId;
    }
}
