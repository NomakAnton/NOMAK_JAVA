public class Main2 {
    public static void main(String[] args) {
        Car car = new Truck("Kamaz",150,12);
        int y = 5;
        double x = y;//явное преобразование
        int z = (int)x;//неявное преобразование
        Car car2 = new SuperTruck("Belaz",30,30,0.7);
    }
}
