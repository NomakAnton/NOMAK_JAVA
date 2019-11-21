public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();
        Car car = new Car(111,1);
        Car ca1 = new Car(222,3);
        Car ca3 = new Car(333,2);
        car.toPark(parking);
        ca1.toPark(parking);
        parking.show();
    }
}
