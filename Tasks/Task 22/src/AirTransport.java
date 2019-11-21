public abstract class AirTransport extends Transport implements CanFly {

    public AirTransport(int number, int theSize) {
        super(number, theSize);
    }

    @Override
    public void fly() {

    }
}
