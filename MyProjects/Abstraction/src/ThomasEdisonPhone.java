public class ThomasEdisonPhone extends AbstractPhone {
    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вращайте трубку сэр");
        System.out.println("Сообщите номер сэр");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");
    }
}
