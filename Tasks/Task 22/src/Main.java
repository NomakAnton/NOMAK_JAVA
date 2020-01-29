public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();
        Car lacetti = new Car("x596вв");
        Car camry = new Car("м541ку");
        Car vaz = new Car("п671лк");
        lacetti.park(parking);
        camry.park(parking);
        lacetti.unpark();
        vaz.park(parking);
    }
}
