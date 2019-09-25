public class iPhone extends AbstractPhone {
    public iPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("подключаю FaceTime");
    }

    @Override
    public void ring(int inputNumber) {

    }
}
