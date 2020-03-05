import models.Car;
import models.User;
import repositories.CarsRepository;
import repositories.CarsRepositoryImpl;
import repositories.UsersRepository;
import repositories.UsersRepositoryImpl;
import utils.ArrayList;
import utils.CarFromConsoleRetriever;
import utils.IdGenerator;
import utils.UserFromConsoleRetriever;

public class Main {
    public static void main(String[] args) {
        IdGenerator idGeneratorForUsers = new IdGenerator("users_id_sequence.txt");
        IdGenerator idGeneratorForCars = new IdGenerator("cars_id_sequence.txt");
        UsersRepository usersRepository = new UsersRepositoryImpl("users.txt",idGeneratorForUsers);
        CarsRepository carsRepository = new CarsRepositoryImpl("cars.txt",idGeneratorForCars);
        CarFromConsoleRetriever car1 = new CarFromConsoleRetriever();
        UserFromConsoleRetriever user1 = new UserFromConsoleRetriever();
      //  User user = user1.retrieveUser();
      //  usersRepository.save(user);
       Car car = car1.retrieveCar();
       carsRepository.save(car);


        //System.out.println(usersRepository.find(4));
    }
}
