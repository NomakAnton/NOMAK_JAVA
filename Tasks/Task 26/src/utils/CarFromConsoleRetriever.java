package utils;

import models.Car;

import java.util.Scanner;

public class CarFromConsoleRetriever {
    private Scanner scanner;

    public CarFromConsoleRetriever(){
        this.scanner = new Scanner(System.in);
    }
    public Car retrieveCar(){
        String model = scanner.nextLine();
        String number = scanner.nextLine();
        int idOwner = Integer.parseInt(scanner.nextLine());

        return new Car(model,number,idOwner);
    }
}
