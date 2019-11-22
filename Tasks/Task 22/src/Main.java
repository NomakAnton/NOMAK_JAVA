public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();
        Car car1 = new Car(111,2);
        Car car2 = new Car(222,4);
        Car car3 = new Car(333,6);
        Car car4 = new Car(555,10);
        Car car5 = new Car(531,4);
        Plane plane1 = new Plane(777,5);
        car1.toPark(parking);
        car2.toPark(parking);
        car3.toPark(parking);
        car4.toPark(parking);
        plane1.toPark(parking);
        car1.leaveParking();
        parking.show();
    }
}
