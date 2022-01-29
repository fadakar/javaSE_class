package com.grf;

import com.grf.Human.Human;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Human> humanArrayList = new ArrayList<>();

        Human person1 = new Human("javad", 22, 78, 170);
        Human person2 = new Human("hassan", 22, 78, 184);

        Human person3 = new Human();
        person3.setName("zahra");
        person3.setWeight(76);
        person3.setHeight(165);
        try {
            person3.setAge(28);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        humanArrayList.add(person1);
        humanArrayList.add(person2);
        humanArrayList.add(person3);
        for (Human person : humanArrayList) {
            if (person.getName().equals("javad")) {
                System.out.println(person);
            }
        }


    }

}
