package org.example;

public class Instructor {
    String name;
    String surname;
    String department;
    boolean available;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Instructor(String name, String surname, String department, boolean available) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.available = available;

    }
}
