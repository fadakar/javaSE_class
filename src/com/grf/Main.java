package com.grf;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<Person>();

        // ------- get data from user -------
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter first name: ");
            String firstName = scanner.next();
            System.out.print("Enter last name: ");
            String lastName = scanner.next();
            System.out.print("Enter code meli: ");
            String codeMeli = scanner.next();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            Person person = new Person(firstName, lastName, codeMeli, age);
            persons.add(person);
        }

        // ------- show data to user -------
        for (Person person : persons) {
            System.out.println("--------------------------------------");
            System.out.println(person.toString());
        }

    }
}
