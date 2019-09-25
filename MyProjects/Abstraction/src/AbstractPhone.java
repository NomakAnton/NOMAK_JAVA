public abstract class AbstractPhone {
    private int year;

    public AbstractPhone(int year){
        this.year = year;
    }
    public abstract void call(int outputNumber);
    public abstract void ring(int inputNumber);
}
/*
Создание телефона,общего предка,который обладает полем - год выпуска,а так же методом звонить и ответить на вызов */