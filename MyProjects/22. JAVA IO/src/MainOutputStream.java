import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainOutputStream {
    public static void main(String[] args) {
        try {
            OutputStream output = new FileOutputStream("output.txt",true);
            output.write('A');
            output.write('Ф');

        }
        catch (IOException e){
            new IllegalArgumentException(e);
        }
    }
}
