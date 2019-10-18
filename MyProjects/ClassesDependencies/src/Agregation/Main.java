package Agregation;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(777,"ВруумВрууууумм");
        Engine engine2 = new Engine(41,"ЧихПых");
        Car toyota = new Car("toyota",engine1);
        toyota.voice();
        Car vaz = new Car("avtovaz",engine2);
        vaz.voice();
    }
}
