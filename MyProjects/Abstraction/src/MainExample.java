public class MainExample {
    public static void main(String[] args) {
        User user1 = new User("Настя");
        AbstractPhone phone1 = new ThomasEdisonPhone(1995);//пример полиморфизма
        AbstractPhone phone2 = new iPhone(2013);

        user1.call(2256781,phone1);
        user1.call(2256781,phone2);
    }
}
/*
Используя вызов одного и того же метода у объекта user мы получили различны результаты.Выбор конкретной реализации
метода call внутри метода сall у Usera  производится динамически на основании конкретного типа вызывающего его объекта
в процессе выполнения программы.В этом и заключается основное преймущество полиморфизма - выбор реализации в процессе
выполнения программы.
 */