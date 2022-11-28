package de.neueFische.mode;

import java.util.Objects;

public class Student {

    private String name;
    private int alter;
    private String fach;

    public Student(String name, int alter, String fach) {
        this.name = name;
        this.alter = alter;
        this.fach = fach;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", fach='" + fach + '\'' +
                '}';
    }
    public String toString2(){
        return "Student" + " name:" + name + " alter:" + alter + " fach:" + fach ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getFach(String pädagogik) {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return alter == student.alter && Objects.equals(name, student.name) && Objects.equals(fach, student.fach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, alter, fach);
    }
}
