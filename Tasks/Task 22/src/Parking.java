import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Parking {
    private ParkingPlace places[];

    public Parking(){
        this.places = new ParkingPlace[10];
        for (int i = 0; i < places.length ; i++) {
            places[i] = new ParkingPlace();
        }

    }
    public boolean park(Transport transport){
        for (int i = 0; i < places.length ; i++) {
            if(places[i].getNumber() == null){
                places[i].setNumber(transport.getNumber());
                places[i].setTransport(transport);
                System.out.println("Машина с номером " + places[i].getNumber() + " припаркована на месте номер " + i);
                return true;
            }
        }
        System.out.println("Свободных мест нет!");
        return false;
    }
    public void unpark(String number){
        for (int i = 0; i < places.length ; i++) {
            if(places[i].getNumber().equals(number)){
                places[i].setTransport(null);
                places[i].setNumber(null);
                System.out.println("Машина с номером " + number + " выехала с парковки");
                return;
            }
        }
        System.out.println("Машины с таким номером на парковке нет");
    }
}
