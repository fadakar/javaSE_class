package com.grf.db;

import com.grf.db.model.bl.PersonBL;
import com.grf.db.model.to.Person;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookManager {

    private Scanner scanner = new Scanner(System.in);
    private PersonBL personBL;

    public PhoneBookManager() throws ClassNotFoundException {
        this.personBL = new PersonBL();
    }


    public void run() throws SQLException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Person person;
        ArrayList<Person> people;

        while (true) {
            switch (showMainMenu()) {
                case 1:
                    try {
                        ArrayList<Person> persons = personBL.all();
                        for (Person item : persons) {
                            System.out.println(item);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    switch (searchMenu()) {
                        case 1:
                            int id = searchByIdAction();
                            person = personBL.find(id);
                            if (person != null) {
                                System.out.println("Founded: " + person);
                            }
                            break;
                        case 2:
                            String name = searchByNameAction();
                            people = personBL.searchByName(name);
                            for (Person item : people) {
                                System.out.println("Founded: " + item);
                            }
                            break;
                        case 3:
                            String number = searchByNumberAction();
                            people = personBL.searchByNumber(number);
                            for (Person item : people) {
                                System.out.println("Founded: " + item);
                            }
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 3:
                    try {
                        person = addPersonAction();
                        personBL.add(person);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    person = editPersonAction();
                personBL.update(person);
                    break;
                case 5:
                    try {
                        int id = deletePersonAction();
                        personBL.delete(id);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    public int showMainMenu() {
        System.out.println("--------------------------");
        System.out.println("[1] show all");
        System.out.println("[2] search");
        System.out.println("[3] add");
        System.out.println("[4] edit");
        System.out.println("[5] delete");
        System.out.println("[6] exit");
        System.out.print(": ");
        return scanner.nextInt();
    }

    public Person addPersonAction() {
        Person person = new Person();
        System.out.print("Enter id: ");
        person.setId(scanner.nextInt());
        System.out.print("Enter name: ");
        person.setName(scanner.next());
        System.out.print("Enter number: ");
        person.setNumber(scanner.next());
        return person;
    }


    public Person editPersonAction() {
        Person person = new Person();
        System.out.print("Enter id: ");
        person.setId(scanner.nextInt());
        System.out.print("Enter name:");
        person.setName(scanner.next());
        System.out.print("Enter number: ");
        person.setNumber(scanner.next());
        return person;
    }


    public int deletePersonAction() {
        System.out.print("Enter id: ");
        return scanner.nextInt();
    }

    public int searchMenu() {
        System.out.println("--------------------------");
        System.out.println("[1] By id");
        System.out.println("[2] By name");
        System.out.println("[3] By number");
        System.out.println("[4] back");
        System.out.print(": ");
        return scanner.nextInt();
    }

    public int searchByIdAction() {
        System.out.print("Enter id: ");
        return scanner.nextInt();
    }

    public String searchByNameAction() {
        System.out.print("Enter name: ");
        return scanner.next();
    }

    public String searchByNumberAction() {
        System.out.print("Enter number: ");
        return scanner.next();
    }


}
