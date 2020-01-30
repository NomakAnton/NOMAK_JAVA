public abstract class AirTransport extends Transport {
    public AirTransport(String number) {
        super(number);
    }

    @Override
    public String getNumber() {
        return super.getNumber();
    }

    @Override
    public void setNumber(String number) {
        super.setNumber(number);
    }

    @Override
    public void park(Parking parking) {
        super.park(parking);
    }

    @Override
    public void unpark() {
        super.unpark();
    }
    public void fly(){

    }
}
