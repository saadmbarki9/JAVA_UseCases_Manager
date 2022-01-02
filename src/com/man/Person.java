package com.man;

public class Person {
    private String firstName,lastName;
    private final String entreprise="DataTruc";
    private float baseSalary;

    public double calculateSalary(){
        return 0;
    }

    public void display(){

    }

    public Person(String firstName, String lastName, float baseSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }
}
