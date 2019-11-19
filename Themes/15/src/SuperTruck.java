public class SuperTruck extends Truck {
    private double loadFactor;
    public SuperTruck(String model,int speed,double capasity, double loadFactor){
        super(model, speed, capasity);
        this.loadFactor = loadFactor;
    }
    public void go(int km){
        this.km +=km*loadFactor;
    }
    public void load(double cargoCapacity){
        cargoCapacity = cargoCapacity * loadFactor;
        if(this.capacity >=cargoCapacity ){
            this.capacity -=cargoCapacity;
        }
    }


}
