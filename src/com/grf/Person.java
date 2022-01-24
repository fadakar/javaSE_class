package com.grf;

public class Person {
    
    public Person() {
    }

    public Person(String firstName, String lastName, String codeMeli, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.codeMeli = codeMeli;
        this.age = age;
    }

    public String firstName;
    public String lastName;
    public String codeMeli;
    public int age;

    public String toString() {
        return "firstName: " + this.firstName + "\n" +
                "lastname: " + this.lastName + "\n" +
                "code meli: " + this.codeMeli + "\n" +
                "age: " + this.age;
    }
}
