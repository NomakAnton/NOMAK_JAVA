public class TryCatch1 {
/*
Пример работы с исключениями
 */
    public static void main(String[] args) {
        System.out.println("Старт программы");//Сообщение о том что программа начала работу

        try{
            System.out.println("Заходим в method1");//уведомление о том что мы зашли в метод
            method1();//заходим в метод
            System.out.println("Вышли из method1, метод завершен корректно ");//сообщение которое будет выведено если в методе не возникнет ошибка
        }
        catch (Exception e){
            System.out.println("Ошибка");//сообщение если в методе будет ошибка(исключение)
        }
        /*
        МОЖЕТ БЫТЬ НЕСКОЛЬКО БЛОКОВ catch которые будут перехватывать разные типы ошибок
        */

        System.out.println("Программа прекратила работу");//сообщение о завершении программы,будет выведено в любом случае
    }
    public static void method1(){//в методе возникнет ошибка так как там присутсвует деление на ноль
        int a = 100;
        int b = 0;
        System.out.println(a/b);
    }
}
/*
Если указать в блоке catch другой класс исключения,то оно не будет перехвачено:
    public static void main(String[] args) throws IOException {
   try {
       BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));
       String firstString = reader.readLine();
       System.out.println(firstString);
   } catch (ArithmeticException e) {

       System.out.println("Ошибка! Файл не найден!");
   }
}
Вывод:
Exception in thread "main" java.io.FileNotFoundException: C:\Users\Username\Desktop\test.txt (Системе не удается найти указанный путь)

Блок catch не сработал так как мы указали чтобы он перехватывал  - ArithmeticException(математическое исключение)а он словил-
FileNotFoundException(не найден нужный файл)

1.Как только в какой-то строчке кода в блоке try возникнет исключение, код после нее уже не будет выполнен.
Выполнение программы сразу “перепрыгнет” в блок catch.

2.Блоков catch может быть несколько.
 */