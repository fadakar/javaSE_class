package com.grf.db;

public class Person {

    private int id;
    private String name;

    private void sayHello() {
        System.out.println("hello reflection");
    }

    private int sum(int a, int b)
    {
        return a + b;
    }
}
