package com.grf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleManager {

    public ConsoleManager(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    private Scanner scanner;
    ArrayList<Person> persons = new ArrayList<>();

    public void run() {
        while (true) {
            int selectMenu = showMenu();
            switch (selectMenu) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    int selectSearchMenu = showSearchMenu();
                    switch (selectSearchMenu) {
                        case 1:
                            System.out.print("Enter name : ");
                            String name = scanner.next();
                            searchPerson(name);
                            break;
                        case 2:
                            System.out.print("Enter age : ");
                            int age = scanner.nextInt();
                            searchPerson(age);
                            break;
                    }
                    break;
                case 3:
                    showAllPerson();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    private int showMenu() {
        clearConsole();
        System.out.println("[1] add");
        System.out.println("[2] search in list");
        System.out.println("[3] show all");
        System.out.println("[4] exit");
        System.out.print(": ");
        return scanner.nextInt();
    }

    private int showSearchMenu() {
        clearConsole();
        System.out.println("[1] by name");
        System.out.println("[2] by age");
        System.out.print(": ");
        return scanner.nextInt();
    }


    private void searchPerson(String name) {
        for (Person person : persons) {
            if (person.getName().toLowerCase().equals(name)) {
                System.out.println("Founded: " + person.toString());
            }
        }
        divider();
    }

    private void searchPerson(int age) {
        for (Person person : persons) {
            if (person.getAge() == age) {
                System.out.println("Founded: " + person.toString());
            }
        }
        divider();
    }

    private void showAllPerson() {
        clearConsole();
        for (Person person : persons) {
            System.out.println(person.toString());
        }
        divider();
    }

    private void divider() {
        System.out.println("-------------------------");
    }


    private void addPerson() {
        Person person = new Person();
        System.out.print("Enter name: ");
        person.setName(scanner.next());
        System.out.print("Enter age: ");
        person.setAge(scanner.nextInt());
        persons.add(person);
        divider();
    }

    private void clearConsole() {
        try {
            System.out.flush();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }


}
