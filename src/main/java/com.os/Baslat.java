package src.main.java.com.os;
import src.main.java.com.os.interfaces.IReader;
import java.io.IOException;


public class Baslat {

    public static void main(String[] args) throws IOException {

        //  Path path = Paths.get(args[0]);
        //  String okunacakDosya = path.toAbsolutePath().toString();

        // TxtReader sınıfından bir nesne oluşturulur.
        IReader txtReader = new TxtReader();

        // Program ilk olarak komut satırından dizini alınan txt dosyasını okur.
        // Bu fonksiyondan prosesleri içeren bir JobDispatchList döner.
        JobDispatchList jobDispatchList = txtReader.okuma();

        // okuma fonkisyonundan dönen bu JobDispatchList i içindeki prosesleri uygun kuyruklara yerleştirmesi için
        // dispatcher sınıfının yerlestir fonksiyonu calistirilir.
        Dispatcher dispatcher = new Dispatcher(jobDispatchList);
        dispatcher.yerlestir();



        }
}
