public class Parking {
    private static final int MAX_NUMBER_OF_PARKING_SPACES = 20;

    public int[] getNumberOfParkingSpaces() {
        return numberOfParkingSpaces;
    }

    private int[] numberOfParkingSpaces;

    public Parking() {
        this.numberOfParkingSpaces = new int[MAX_NUMBER_OF_PARKING_SPACES];
    }

    public boolean vacancyRequest(int size) {
        if (size > numberOfParkingSpaces.length) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < numberOfParkingSpaces.length; i++) {

            if (numberOfParkingSpaces[i] == 0) {
                count++;
                if (count == size) {
                    count = 0;
                    return true;
                }
                try {
                    for (int j = 1; j < size; j++) {
                        if (numberOfParkingSpaces[i + 1] == 0) {
                            count++;
                            i++;
                        }
                    }
                } catch (Exception e) {
                    return false;
                }
                if (count == size) {
                    return true;
                } else {
                    count = 0;
                }

            }

        }
        return false;
    }



    public void show(){
        for (int i = 0; i < numberOfParkingSpaces.length ; i++) {
            System.out.println(numberOfParkingSpaces[i]);
        }
    }
}
