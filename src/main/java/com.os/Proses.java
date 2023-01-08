package src.main.java.com.os;

import java.util.Random;
import java.util.Timer;

public class Proses {

    private int prosesId;
    private int varisZamani;
    private int oncelik;
    private int prosesZamani;
    private String prosesRenkKodu;
    private boolean prosesAskidaMi;
    private boolean prosesCalistirildiMi = false;



    private Timer timerObject;


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
        String processOncelik = " oncelik:" + this.getOncelik();
        String processArrivalTime = " kalan sure:" + this.getProsesZamani() + " sn)";
        System.out.println(this.prosesRenkKodu + information + processId + processOncelik + processArrivalTime +  "\u001B[0m");

    }

    public String getPrintText(float dispatcherTimer, String printType){

        String information = String.format("%.4f", dispatcherTimer) + " sn proses " + printType;
        String processId = "(id:" + String.format("%04d", this.getProsesId());
        String processOncelik = " oncelik:" + this.getOncelik();
        String processArrivalTime = " kalan sure:" + this.getProsesZamani() + " sn)";
        return this.prosesRenkKodu + information + processId + processOncelik + processArrivalTime +  "\u001B[0m \n";

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

    public Timer getTimerObject() {
        return timerObject;
    }

    public void setTimerObject(Timer timerObject) {
        this.timerObject = timerObject;
    }

    public boolean getProsesAskidaMi() {
        return prosesAskidaMi;
    }

    public void setProsesAskidaMi(boolean prosesAskidaMi) {
        this.prosesAskidaMi = prosesAskidaMi;
    }

    public boolean getProsesCalistirildiMi() {
        return prosesCalistirildiMi;
    }

    public void setProsesCalistirildiMi(boolean prosesCalistirildiMi) {
        this.prosesCalistirildiMi = prosesCalistirildiMi;
    }
}
