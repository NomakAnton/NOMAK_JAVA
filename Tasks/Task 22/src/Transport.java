public abstract class Transport {
    private String number;
    private Parking parking;

    public Transport(String number){
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public void park(Parking parking){
       if(parking.park(this) == true){
           this.parking = parking;
       }
       else this.parking = null;

    }
    public void unpark(){
        this.parking.unpark(this.number);
    }

}
