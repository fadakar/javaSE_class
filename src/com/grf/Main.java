package com.grf;


public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("hassan","ahmadi","2323", 32);
        Person person2 = new Person("ali","rezaee","2334", 32);
        Person person3 = new Person("reza","mohmadi","4345", 32);


        System.out.println(person1.toString());
        System.out.println("--------------------------------------");
        System.out.println(person2.toString());
        System.out.println("--------------------------------------");
        System.out.println(person3.toString());
    }
}
