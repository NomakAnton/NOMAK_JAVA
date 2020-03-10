import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args)throws Exception {
        String fileName = "/home/op-fiz21/JAVA/NOMAK_JAVA/New.csv";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String s = reader.readLine();
        System.out.println(s);
    }
}
