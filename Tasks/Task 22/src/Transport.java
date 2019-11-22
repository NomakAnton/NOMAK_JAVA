public abstract class Transport {

    private int number;
    private int size;


    public Transport(int number,int size ) {
        this.number = number;
        this.size = size;
    }

    public Parking getParking() {
        return parking;
    }

    private  Parking parking;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getsize() {
        return size;
    }

    public void setTheSize(int size) {
        this.size = size;
    }


    public void toPark(Parking parking){
        if(parking.vacancyRequest(this.getsize()) == true){
            System.out.println("Свободные места есть !");
            this.parking = parking;
            Parking(parking);
        }
        else {
            System.out.println("К сожаление свободных мест для Вашего транспорта нет!");
        }
    }

    private void Parking(Parking parking){
        int count = 0;
        int start;
        for (int i = 0; i < parking.getNumberOfParkingSpaces().length ; i++) {
                start = i;
            if(parking.getNumberOfParkingSpaces()[i] == 0) {
                count++;
                if (count == size) {
                    count = 0;
                    parking.getNumberOfParkingSpaces()[i] = number;
                    return;
                }
                for (int j = 1; j < size; j++) {
                    if (parking.getNumberOfParkingSpaces()[i + 1] == 0) {
                        count++;
                        i++;
                    }
                }
            }
                if (count == size) {
                    for (int k = 0; k < size ; k++) {
                        parking.getNumberOfParkingSpaces()[start] = number;
                        start++;
                    }
                    return;
                }
                else {
                    count = 0;
                }

        }
    }
    public void leaveParking(){
        for (int i = 0; i < parking.getNumberOfParkingSpaces().length ; i++) {
            if (parking.getNumberOfParkingSpaces()[i]== this.number){
                parking.getNumberOfParkingSpaces()[i] = 0;
            }

        }

    }
}
