public class Main2 {
    public static void main(String[] args) {
        Car car1 = new Car("camry",150);
        Car car2 = new Truck("Kamaz",150,12);
        Car car3 = new SuperTruck("Belaz",30,30,0.7);
        int y = 5;
        double x = y;//явное преобразование
        int z = (int)x;//неявное преобразование

        Car cars[] = {car1,car2,car3};

        for (int i = 0; i < cars.length ; i++) {
            cars[i].go(20);
        }
        System.out.println(car1.getKm());
        System.out.println(car2.getKm());
        System.out.println(car3.getKm());
    }
}
