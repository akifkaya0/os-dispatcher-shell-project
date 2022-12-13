package src.main.java.com.os;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        //Enes Bekkaya

        //  Path path = Paths.get(args[0]);
        //  String okunacakDosya = path.toAbsolutePath().toString();

        FileReader fr = new FileReader("C:\\Users\\HP\\Desktop\\giriş.txt");
        String line;
        BufferedReader br = new BufferedReader(fr);

        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

    }
}
