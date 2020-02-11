import java.io.FileInputStream;
import java.io.InputStream;

public class MainInputStream {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("input.txt");
        int letter = inputStream.read();

        while (letter != -1){
            System.out.println((char)letter);
            letter = inputStream.read();
        }
    }
}
