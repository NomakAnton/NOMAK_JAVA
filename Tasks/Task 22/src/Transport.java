public abstract class Transport {

    private int number;
    private int theSize;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTheSize() {
        return theSize;
    }

    public void setTheSize(int theSize) {
        this.theSize = theSize;
    }


    public Transport(int number, int theSize) {
        this.number = number;
        this.theSize = theSize;
    }

    public void toPark(Parking parking){
        if(parking.vacancyRequest(this.getTheSize()) == true){
            parking.addTransportForParking(getTheSize(),getNumber());
        }
        else {
            System.out.println("К сожаление свободных мест нет!");
        }
    }

}
