package de.neueFische;

public class Main {
    public static void main(String[] args) {
        CAr bmw = new CAr();
        bmw.brand = "BMW";
        bmw.color = "Blau";
        bmw.model = "3er";
        bmw.type = "Sedan";
        bmw.year = 2015;

        CAr audi= new CAr();
        audi.brand = "Audi";
        audi.year = 2019;
        audi.type = "Coupe";
        audi.color = "Silver";
        audi.model = "A3";

        Student student1 = new Student();
        student1.setAlter(25);
        student1.setFach("bio");
        student1.setName("Harald");

        Student student2 = new Student();
        student2.setName("Berta");
        student2.setFach("Pädagogik");
        student2.setAlter(35);

        Student student3 = new Student();
        student3.setAlter(20);
        student3.setFach("Sport");
        student3.setName("Phillip");

        System.out.println(student3.getAlter());

        String bmwDescription = bmw.describbeMe();
        String audiDescription = audi.describbeMe();

        System.out.println(bmwDescription);
        System.out.println(audiDescription);

    }
}