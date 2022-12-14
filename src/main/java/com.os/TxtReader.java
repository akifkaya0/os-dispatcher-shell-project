package src.main.java.com.os;

import src.main.java.com.os.interfaces.IReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtReader implements IReader {

    // verilen dizindeki txt dosyasını okuyup geriye prosesleri içeren JobDispatchList döner.
    public JobDispatchList okuma() throws IOException {

        JobDispatchList jobDispatchList=new JobDispatchList();

        // Dosyanın okunması için oluşturulan FileReader nesnesi
        FileReader fr = new FileReader("C:\\Users\\Lenovo\\Desktop\\giriş.txt");
        String line;
        BufferedReader br = new BufferedReader(fr);

        while((line = br.readLine()) != null) {

            // Txt dosyasının bir satırı split fonksiyonu kullanılarak virgül (,) karakterine göre bölünür.
            String[] processDataStringArray = line.split(",");

            // String dizisindeki veriler uygun değişkenlere atanır.
            int prosesVarisZamani = Integer.valueOf(processDataStringArray[0].trim());
            int prosesOncelik = Integer.valueOf(processDataStringArray[1].trim());
            int prosesZamani = Integer.valueOf(processDataStringArray[2].trim());

            // Yeni bir proses nesnesi oluşturulur. Elde edilen veriler proses yapıcı fonksiyonuna gönderilir.
            Proses proses =new Proses(prosesVarisZamani , prosesOncelik , prosesZamani);

            // Oluşturulan proses JobDispatchList içerisinde eklenirç
            jobDispatchList.addProcess(proses);

        }

        return jobDispatchList;
    }

}
