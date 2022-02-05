package com.grf.animal;

public class Main {
    public static void main(String[] args) {
        Person person= new Person();
        person.setName("ali");
        PhoneBook.add(person);

        Person person2= new Person();
        person.setName("reza");
        PhoneBook.add(person2);

        System.out.println(PhoneBook.getInstance());
    }
}
