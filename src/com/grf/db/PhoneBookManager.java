package com.grf.db;

import com.grf.db.model.bl.PersonBL;
import com.grf.db.model.to.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookManager {

    private Scanner scanner = new Scanner(System.in);
    private PersonBL personBL;

    public PhoneBookManager() {
        this.personBL = new PersonBL();
    }


    public void run() {

        while (true) {
            switch (showMainMenu()) {
                case 1:
                    try {
                        ArrayList<Person> persons = personBL.all();
                        for (Person person : persons) {
                            System.out.println(person);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    break;
                case 3:
                    try {
                        Person person = addPerson();
                        personBL.add(person);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    break;
                case 5:
                    try {
                        Person person = deletePerson();
                        personBL.delete(person.getId());
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
        System.out.println("[1] show all person");
        System.out.println("[2] search person");
        System.out.println("[3] add person");
        System.out.println("[4] update person");
        System.out.println("[5] delete person");
        System.out.println("[6] exit");
        System.out.print(": ");
        return scanner.nextInt();
    }

    public Person addPerson() {
        Person person = new Person();
        System.out.print("Enter id: ");
        person.setId(scanner.nextInt());
        System.out.print("Enter name: ");
        person.setName(scanner.next());
        System.out.print("Enter number: ");
        person.setNumber(scanner.next());
        return person;
    }

    public Person deletePerson() {
        Person person = new Person();
        System.out.print("Enter id: ");
        person.setId(scanner.nextInt());
        return person;
    }
}
