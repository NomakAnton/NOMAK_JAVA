public class Car {

    private static final int DEFAULT_KM = 0;
    private static final int MIN_SPEED = 1;

    private String model;
    private int km;
    private int speed;

    public Car(String model, int speed){
        this.model = model;
        if(speed >=MIN_SPEED){
            this.speed = speed;
        }
        else {
            this.speed = speed;
        }
        this.km = DEFAULT_KM;
    }

    public String getModel() {
        return model;
    }

    public int getKm() {
        return km;
    }

    public int getSpeed() {
        return speed;
    }
    public void go(int km){
        this.km+=km;
    }
}
