package repositories;

import models.Car;
import models.User;
import utils.ArrayList;
import utils.IdGenerator;
import utils.List;

import java.io.*;

public class CarsRepositoryImpl implements CarsRepository {
    private String fileName;
    private IdGenerator idGenerator;

    public CarsRepositoryImpl(String fileName,IdGenerator idGenerator){
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }

    @Override
    public void save(Car model) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
            int id = idGenerator.generateId();
            model.setId(id);
            writer.write(model.getId()+ " "+ model.getModel() + " " + model.getNumber() + " " + model.getIdOwner());
            writer.newLine();
            writer.close();

        }
        catch (IOException e){
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public Car find(int id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currentLine = reader.readLine();
            while (currentLine != null){
                String resultStringSplit [] = currentLine.split(" ");
                int result = Integer.parseInt(resultStringSplit[0]);
                if(result == id){
                    Car car = new Car(resultStringSplit[1],resultStringSplit[2],Integer.parseInt(resultStringSplit[3]));
                    return car;
                }
                currentLine = reader.readLine();
            }
            return null;
        }
        catch (IOException e){
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public List<Car> findByOwner(User owner) {
        ArrayList<Car> result = new ArrayList<>();
        int idOwner = owner.getId();
        try{
            BufferedReader reader = new BufferedReader(new FileReader("cars.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null){
               String splitString[] = currentLine.split(" ");
               int i = Integer.parseInt(splitString[3]);
               if (idOwner == i){
                   Car car = new Car(splitString[1],splitString[2],Integer.parseInt(splitString[3]));
                   car.setId(Integer.parseInt(splitString[0]));
                   result.addToBegin(car);
               }
               currentLine = reader.readLine();
            }
            return result;
        }
        catch (IOException e){
            throw new IllegalArgumentException(e);
        }


    }
}
