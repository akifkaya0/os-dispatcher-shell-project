package src.main.java.com.os;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException {
        //  Path path = Paths.get(args[0]);
        //  String okunacakDosya = path.toAbsolutePath().toString();

        TxtReader txtReader = new TxtReader();

        JobDispatchList jobDispatchList = txtReader.okuma();
        Dispatcher dispatcher = new Dispatcher(jobDispatchList);
        dispatcher.yerlestir();




    }
}
