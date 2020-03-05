package repositories;

import models.User;
import utils.IdGenerator;

import java.io.*;

public class UsersRepositoryImpl implements UsersRepository {
    private String fileName;
    private IdGenerator idGenerator;
    public UsersRepositoryImpl(String fileName,IdGenerator idGenerator ){
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }
    @Override
    public void save(User model) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
            int id = idGenerator.generateId();
            model.setId(id);
            writer.write(model.getId()+ " " + model.getFirstName() + " " + model.getLastName() + " " + model.getLogin()+ " " + model.getPassword());
            writer.newLine();
            writer.close();

        }
        catch (IOException e){
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public User findById(int id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currentLine = reader.readLine();
            while (currentLine != null){
                String userDate [] = currentLine.split(" ");
                int candidate = Integer.parseInt(userDate[0]);
                if(candidate == id){
                    User user = new User(userDate[1],userDate[2],userDate[3],userDate[4]);
                    user.setId(id);
                    return user;
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
    public User findByLastName(String lastName) {
        return null;
    }
}
