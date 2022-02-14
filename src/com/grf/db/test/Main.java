package com.grf.db.test;

import com.grf.db.model.to.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            MyPersonDA myPersonDA = new MyPersonDA();
            Person person = new Person();
            person.setId(88);
            person.setName("test");
            person.setNumber("3333");
            myPersonDA.add(person);

            ArrayList<Person> people = myPersonDA.all();
            for (Person item : people) {
                System.out.println(item);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
