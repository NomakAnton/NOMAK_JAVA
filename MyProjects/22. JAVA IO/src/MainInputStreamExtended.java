import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class MainInputStreamExtended {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("input.txt");
       byte bytes[] = new byte[15];
       inputStream.read(bytes);
        System.out.println(Arrays.toString(bytes));
    }
}
