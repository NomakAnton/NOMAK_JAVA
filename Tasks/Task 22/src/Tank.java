public class Tank extends GroundTransport implements Shoot {
    public Tank(String number) {
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

    @Override
    public void shoot() {

    }
}
