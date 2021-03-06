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

    *throw - оператор для выбрасывания исключения

    *Наследование позволяет определять свои исключения.


    ## Проверяемые исключения - это исключения,  объекты которых необходимо перехватывать (try-catch) или прорасывать наверх (trows)
    в обязательном порядке(если вы, вызываете метод, который потенциально выбрасывает проверяемое исключение). Если ваш метод выбрасывает
    данное исключение,
    вы обязаны заявить об этом в сигнатуре метода через ключевое слово throws. Все потомки класса Exception, кроме RuntimeException),
    а так же Throwable и сам Exception - являются проверяемыми исключениями.

    *Все потомки класса Exception (кроме RuntimeException), а также Throwable и сам Exception - является проверяемыми исключениями.

    * В случае, когда вы пробрасываете проверяемое исключение наверх, вы заставляете пользователя вашего класса лио обработать, лио снова пробросить
    наверх. Следовательно, при низкой (или ленивой) квалификации программиста исключение может дойти до "клиентского места".

    * При попадании на "проверяемое исключение" обработайте его НА МЕСТЕ и выбросите непроверяемое исключение поверх проверяемого

    * finally - ключевое слово, инструкция, внутри которой описывается набор команд, который выполняется всегда, независимо
    от поведения кода внутри try-catch

     */
}
