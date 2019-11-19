public class Main {
    public static void main(String[] args) {
        Car car = new Car("camry",150);
        Truck truck = new Truck("Kamaz",180,12.0);
        SuperTruck superTruck = new SuperTruck("Belaz",15,40,2);
        car.go(15);
        truck.go(20);

        truck.load(5.0 );
        superTruck.load(5);

        System.out.println(car.getKm());
        System.out.println(truck.getKm());
        System.out.println(truck.getLoadedCapacity());
        System.out.println(superTruck.getLoadedCapacity());

    }
}
