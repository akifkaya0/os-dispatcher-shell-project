package src.main.java.com.os;

public class Proses {
    private int varisZamani;
    private int oncelik;
    private int prosesZamani;
    public Proses(int varisZamani, int oncelik, int prosesZamani) {
        this.varisZamani = varisZamani;
        this.oncelik = oncelik;
        this.prosesZamani = prosesZamani;

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
}
