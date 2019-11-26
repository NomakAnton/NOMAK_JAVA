import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args)throws Exception {
        //Создаем объект класса "чтение",указываем в конструкторе путь к файлу,откуда будем читать
        InputStream inputStream = new FileInputStream("/home/op-fiz21/JAVA/NOMAK_JAVA/TestInput.txt");
        //Создаем объект класса "запись",указываем в конструкторе путь к файлу,куда будем записывать
        OutputStream outputStream = new FileOutputStream("/home/op-fiz21/JAVA/NOMAK_JAVA/TestOutput.txt");
        //создаем цикл,где в условии - "пока количество байт > 0, то есть пока есть что читать
        while (inputStream.available()>0){
            int data = inputStream.read();//кладем байт в переменную "data"
            outputStream.write(data);//в  объект "запись"кладем этот байт
        }
        inputStream.close();//закрываем поток
        outputStream.close();//закрываем поток
    }

}
