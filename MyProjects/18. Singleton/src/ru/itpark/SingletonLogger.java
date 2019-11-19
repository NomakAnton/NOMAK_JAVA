package ru.itpark;

import java.time.LocalDate;

import java.util.Locale;

public class SingletonLogger  {
    private String filePath;
    private String loggerName;
    private static final SingletonLogger instance;

    static {
        instance = new SingletonLogger();
    }
    public static SingletonLogger getLogger(){
        return instance;
    }

    private SingletonLogger(){

    }
        public void setFilePath(String loggerName,String filePath){
            this.loggerName = loggerName;
            this.filePath = filePath;
        }

    public void log(String message){
        System.out.println(loggerName + " " + LocalDate.now()+ " wrote [" + message + " ] to < " + filePath + " >");

    }
}
