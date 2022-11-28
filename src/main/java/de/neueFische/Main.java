package de.neueFische;

import de.neueFische.mode.Student;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car("BMW","Sedan","blau","3er");
        Car audi= new Car("auti","coupe","silver","a3");
        Student student4 = new Student("Harald",25,"bio");
        Student student1 = new Student("Harald",25,"bio");
        Student student2 = new Student("Berta",35,"Pädagogik");
        Student student3 = new Student("Phillip",20,"Sport");



        /*String bmwDescription = bmw.describbeMe();
        String audiDescription = audi.describbeMe();

        System.out.println(student2.toString2());
        System.out.println(student1.toString());

        System.out.println(bmwDescription);
        System.out.println(audiDescription);

        System.out.println(student1.equals(student4));*/


    }
}