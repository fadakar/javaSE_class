package com.grf.collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        Human person1 = new Human();
        person1.setName("ali");
        person1.getHouses().add(new House("tehran tarasht ghasemi pelak 2"));
        person1.getHouses().add(new House("tehran tajrish moradi pelak 2123"));
        person1.getHouses().add(new House("shiraz banafshe kh test pelak 533"));
        humans.add(person1);

        Human person2 = new Human();
        person2.setName("hassan");
        person2.getHouses().add(new House("tabirz "));
        person2.getHouses().add(new House("semnan"));
        person2.getHouses().add(new House("tehran"));
        humans.add(person2);

        Human person3 = new Human();
        person3.setName("reza");
        person3.getHouses().add(new House("rasht "));
        person3.getHouses().add(new House("ardebil"));
        person3.getHouses().add(new House("mashhad"));
        humans.add(person3);


        for (Human person : humans) {
            System.out.println(person.getName() + ": ");
            for (House house : person.getHouses()) {
                System.out.println("\t" + house.getAddress());
            }
        }
    }
}
