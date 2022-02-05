package com.grf.animal;

import java.util.ArrayList;

public class PhoneBook {
    private static ArrayList<Person> list;

    private PhoneBook() {

    }

    public static ArrayList<Person> getInstance() {
        if (list == null) {
            list = new ArrayList<Person>();
        }
        return list;
    }

    public static void add(Person person){
        getInstance().add(person);
    }


}
