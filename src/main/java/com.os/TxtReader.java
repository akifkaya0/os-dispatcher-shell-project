package src.main.java.com.os;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtReader {
    public JobDispatchList okuma() throws IOException {
        JobDispatchList jobDispatchList=new JobDispatchList();
        FileReader fr = new FileReader("D:\\işletim sistemleri 2\\giriş.txt");
        String line;
        BufferedReader br = new BufferedReader(fr);

        while((line = br.readLine()) != null) {
            String [] deneme=line.split(",");

            Proses proses =new Proses(Integer.valueOf(deneme[0].trim()),Integer.valueOf(deneme[1].trim()),Integer.valueOf(deneme[2].trim()));

            jobDispatchList.proses.add(proses);
        }
        return jobDispatchList;
    }
}
