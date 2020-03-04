/**
 * Класс отвечающий за сохранение объекта User - в файл.
 */
package repositories;

import models.User;
import utils.IdGenerator;

import java.io.*;

public class UsersRepositoryImpl implements UsersRepository {

    private String fileName;//поле в которое мы прописываем название файла, куда мы будем сохранять
    private IdGenerator idGenerator;
    public UsersRepositoryImpl(String fileName,IdGenerator idGenerator) {
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }

    @Override
    public void save(User model) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.fileName,true));
            int id = idGenerator.generateId();
            model.setId(id);
            writer.write(model.getId() + " " + model.getFirstName() + " " + model.getLastName() + " "+ model.getLogin() + " " + model.getPassword());

            writer.newLine();//лучше написать так а не "\n" - так как в разных операционках переход мб либо "\n" либо "\r\n"
            writer.close();

        }
        catch (IOException e){
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public User find(int id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currentLine = reader.readLine();
            while (currentLine != null){
                String userData[] = currentLine.split(" ");
                int currentId = Integer.parseInt(userData[0]);
                if(currentId == id){
                    User user = new User(userData[1],userData[2],userData[3],userData[4]);
                    user.setId(currentId);
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
}
