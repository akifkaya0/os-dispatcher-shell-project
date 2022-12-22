package src.main.java.com.os;

import java.util.Random;

public class Proses {

    private int prosesId;
    private int varisZamani;
    private int oncelik;
    private int prosesZamani;
    private String prosesRenkKodu;
    private int baslamaZamani;

    public void setBaslamaZamani(int baslamaZamani) {
        this.baslamaZamani = baslamaZamani;
    }

    public int getBaslamaZamani() {
        return baslamaZamani;
    }


    public Proses(int prosesId, int varisZamani, int oncelik, int prosesZamani) {
        this.varisZamani = varisZamani;
        this.oncelik = oncelik;
        this.prosesZamani = prosesZamani;
        this.prosesId = prosesId;
        this.prosesRenkKodu = getRandomColor();
    }


    public void printProses(float dispatcherTimer, String printType) {

        String information = String.format("%.4f", dispatcherTimer) + " sn proses " + printType;
        String processId = "(id:" + String.format("%04d", this.getProsesId());
        String processOncelik = " öncelik:" + this.getOncelik();
        String processArrivalTime = " kalan süre:" + this.getProsesZamani() + " sn)";


        System.out.format("%s %20s  %10s  %10s  %10s \u001B[0m \n", this.prosesRenkKodu, information, processId, processOncelik, processArrivalTime);

    }

    private String getRandomColor() {

        Random randColorGenerator = new Random();
        int red = randColorGenerator.nextInt(255);
        int green = randColorGenerator.nextInt(255);
        int blue = randColorGenerator.nextInt(255);

        return "\033[38;2;" + red + ";" + green + ";" + blue + "m";

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

    public String getProsesRenkKodu() {
        return prosesRenkKodu;
    }

    public void setProsesRenkKodu(String prosesRenkKodu) {
        this.prosesRenkKodu = prosesRenkKodu;
    }
}
