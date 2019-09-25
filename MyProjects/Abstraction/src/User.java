public class User {
    private String name;

    public User(String name){
        this.name = name;
    }
    public void call(int number,AbstractPhone phone){
        phone.call(number);
    }
}
/*
Создаем класс пользователя,у которого есть метод позвонить,который принимает номер,и объект класса телефон и
внутри метода вызывает метод позвонить у класса телефон
 */