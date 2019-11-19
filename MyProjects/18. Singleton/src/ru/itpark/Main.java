package ru.itpark;

public class Main {
    public static void main(String[] args) {
        // SingletonLogger logger = new SingletonLogger();
        SingletonLogger logger = SingletonLogger.getLogger();
        logger.setFilePath("SimpleLogger","Logger");
        logger.log("Hello from main");
    }
}
