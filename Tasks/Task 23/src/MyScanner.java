

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MyScanner {
    private String fileName;
    private InputStream inputStream;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public MyScanner(String fileName){
        this.fileName = fileName;
        try {

            this.inputStream = new FileInputStream(fileName);
        }
        catch (FileNotFoundException e){
            new IllegalArgumentException(e);
        }

    }
    public int nextInt(){
        ArrayList<Character> list = new ArrayList<>();
        try {
            int letter = inputStream.read();
            while (letter != -1){
                list.add((char)letter);
                letter = inputStream.read();
            }
            String result1 = "";
            for (int i = 0; i < list.size() ; i++) {
                result1 = result1 + list.get(i);
            }
            int result = Integer.parseInt(result1);
            return result;

        }
        catch (IOException e) {
            new IllegalArgumentException(e);
        }
        return -1;
    }
    public  int nextIntMarsel(){
        try {
            byte bytes[] = new byte[15];
            inputStream.read(bytes);
            String s = new String(bytes);
            System.out.println(s);
            int result = Integer.parseInt(s);
            return result;

        }
        catch (IOException e){
            new IllegalArgumentException(e);
        }
        return -1;
    }

}
