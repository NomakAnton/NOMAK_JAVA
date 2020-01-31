public class Theory2 {
    /*
   ## Механизм работы с исключениями

   *Возникает исключительная ситуация, JVM создает объект класса исключения, далее, печатает стек вызовов и останавливает
   программу.

   ## Класс Throwable
    У класса есть поля:
    private String detailMessage; - это детальное описание ошибки, например для ArithmeticException - / by zero
    private StackTraceElement[] stackTrace; - здесь храниться стек

    private Throwable cause; // поле, которое хранит ссылку на причину возникновения ошибки - такая же ошибка
public final class StackTraceElement ...
    private String declaringClass;
    private String methodName;
    private String fileName;
    private int    lineNumber;


## Перехват исключений и их обработка

    *try - данным ключевым словом помечается блок кода, который потенциально может сгенирировать исключение, в котором может возникнуть ошибка

    *catch - здесь указывается тип ошибки, ее объект и поведение программы при возникновении исключения.

    *Конструкция try-catch позволяет остановить программу в РАБОЧЕМ СОСТОЯНИИ.



     */
}
