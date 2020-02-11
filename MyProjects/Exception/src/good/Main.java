package good;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Files files = new Files();
        System.out.println(files.getAbsolutePath("input_1.txt"));
        System.out.println(files.getAbsolutePath("input_2.txt"));
        System.out.println(files.getAbsolutePath("output_1.txt"));
    }
}
