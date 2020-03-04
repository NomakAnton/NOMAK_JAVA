/**
 * Класс отвечающий за считывание User с консоли и возвращающий нового User (возврат прописан в конструкторе)
 */
package utils;

import models.User;

import java.util.Scanner;

public class UserFromConsoleRetriever {
    private Scanner scanner;

    public UserFromConsoleRetriever(){
        this.scanner = new Scanner(System.in);
    }
    public User retrieveUser(){
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String login = scanner.nextLine();
        String password = scanner.nextLine();

        return new User(firstName,lastName,login,password);
    }
}
