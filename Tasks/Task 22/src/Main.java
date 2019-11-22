public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();
        Car car = new Car(111,2);
        Car ca1 = new Car(222,4);
        Car ca3 = new Car(333,6);
        car.toPark(parking);
        ca1.toPark(parking);
        ca3.toPark(parking);
        parking.show();
    }
}
