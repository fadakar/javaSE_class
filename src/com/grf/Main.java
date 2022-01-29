package com.grf;

import com.grf.Human.Human;

public class Main {
    public static void main(String[] args) {


            Human person1 = new Human("ali", 22, 78, 170);
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


        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());


    }

}
