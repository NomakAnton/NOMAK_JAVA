public class MainBoxingUnboxing {
    public static void main(String[] args) {

        //boxing(упаковка), упаковали 10ку в объект типа Integer;
    Integer i1 = new Integer(10);

         //unboxing, распаковка, забрали у объкта типа Integer значение 10
    int i1Value = i1.intValue();

        //autoboxing - автоупаковка
        Integer i2 = 10;


        //autounboxing, автораспаковка
        int i2Value = i2;
    }
}
