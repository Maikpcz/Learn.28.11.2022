package de.neueFische;

public class CAr {
    String brand;
    static int year;
    String type;

    public CAr(String brand, String type, String color, String model) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.model = model;
    }

    String color;
    String model;

    String describbeMe(){
        return color +" "+ brand;
    }

}
