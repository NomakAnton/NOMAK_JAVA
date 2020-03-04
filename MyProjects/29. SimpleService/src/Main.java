import models.User;
import repositories.UsersRepository;
import repositories.UsersRepositoryImpl;
import utils.IdGenerator;
import utils.UserFromConsoleRetriever;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserFromConsoleRetriever retriever = new UserFromConsoleRetriever();
        IdGenerator idGenerator = new IdGenerator("users_id_sequence.txt");
        UsersRepository usersRepository = new UsersRepositoryImpl("users.txt",idGenerator);
    //  User user = retriever.retrieveUser();
    //  usersRepository.save(user);
        System.out.println(usersRepository.find(2));


    }
}
