package de.neueFische;

public class Car {
    String brand;
    static int year;
    String type;

    public Car(String brand, String type, String color, String model) {
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
