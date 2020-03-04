import java.io.BufferedReader;
import java.io.FileReader;

public class MainBufferedReader {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("input_3.txt"));
        String name = reader.readLine();
        String firstName = reader.readLine();
        String age = reader.readLine();
        reader.close();
        System.out.println(name + " " + firstName + " " + age);
    }
}
