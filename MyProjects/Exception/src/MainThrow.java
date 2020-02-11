import custom.PasswordLengthException;

import java.util.Scanner;

public class MainThrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if(password.length()>=7){
            System.out.println("Все хорошо");
        }
        else {
            throw new PasswordLengthException();
         // throw new IllegalArgumentException("Некорректный пароль");
        }
        System.out.println("Пароь сохранен");

    }
}
