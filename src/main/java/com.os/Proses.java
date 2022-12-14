package src.main.java.com.os;

public class Proses {
    private int varisZamani;
    private int oncelik;
    private int prosesZamanı;
    public Proses(int varisZamani, int oncelik, int prosesZamanı) {
        this.varisZamani = varisZamani;
        this.oncelik = oncelik;
        this.prosesZamanı = prosesZamanı;
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

    public int getProsesZamanı() {
        return prosesZamanı;
    }

    public void setProsesZamanı(int prosesZamanı) {
        this.prosesZamanı = prosesZamanı;
    }
}
