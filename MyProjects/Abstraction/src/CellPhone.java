public class CellPhone extends WirelessPhone {


    public CellPhone(int year, int hour) {
        super(year, hour);

    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Звоню на номер " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Принимаю звонок " + inputNumber);
    }
}
/*
Создаем класс - мобильный телефон.Он наследуется от "Беспроводного телефона" и переопределяет методы позвонить и принять звонок
 */