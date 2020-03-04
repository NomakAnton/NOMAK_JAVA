package models;

public class Car {
    private int id;
    private String model;
    private String number;
    private int idOwner;

    public String getModel() {
        return model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public Car(String model, String number, int idOwner) {
        this.model = model;
        this.number = number;
        this.idOwner = idOwner;
    }
}
