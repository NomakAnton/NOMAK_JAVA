public abstract class WirelessPhone extends AbstractPhone {
    private int hour;

    public WirelessPhone(int year,int hour) {
        super(year);
        this.hour = hour;
    }
}
/*
Создаем абстрактный класс - Беспроводной телефон,он наследуется от "Абстрактного телефона" и наследует его поля
через конструктор,так как поля у абстракного класса помечены модификатором 'private' то доступа к ним мы не имеем,но можем
наследовать,а точнее мы обязаны наследовать конструктор класса родителя.
 */