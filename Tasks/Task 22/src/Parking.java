public class Parking {
    private static final int MAX_NUMBER_OF_PARKING_SPACES = 20;
    private int [] numberOfParkingSpaces;

    public Parking() {
        this.numberOfParkingSpaces = new int[MAX_NUMBER_OF_PARKING_SPACES];
    }

    public boolean vacancyRequest(int size){
        for (int i = 0; i < numberOfParkingSpaces.length ; i++) {
            if(numberOfParkingSpaces[i] == 0){
                int count = 1;
                if (count == size){
                    return true;
                }
                for (int j = count; j < size; j++) {
                    if(numberOfParkingSpaces[i] != 0){
                        count = 0;
                        break;
                    }
                    count++;
                    i++;
                }
                if(count == size){
                    return true;
                }
            }
        }
        return false;
    }
    public void addTransportForParking(int size,int number){
        int count;
        for (int i = 0; i < numberOfParkingSpaces.length ; i++) {
            if(numberOfParkingSpaces[i] == 0){
                count = 1;
                if (count == size){
                    numberOfParkingSpaces[i] = number;
                    return;
                }
                for (int j = count;j < size ; j++) {
                    if (numberOfParkingSpaces[i] != 0){
                        count = 0;
                        break;
                    }
                    count++;
                    i++;
                }
                if(count == size){
                    for (int j = 0; j < size; j++) {
                        numberOfParkingSpaces[i] = number;
                        i++;
                    }
                }
            }
        }
    }

    public void show(){
        for (int i = 0; i < numberOfParkingSpaces.length ; i++) {
            System.out.println(numberOfParkingSpaces[i]);
        }
    }
}
