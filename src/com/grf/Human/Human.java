package com.grf.Human;

public class Human {

    public Human() {

    }

    public Human(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    private String name;
    private int age;
    private int weight;
    private int height;


    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age > 0) {
            this.age = age;
        } else {
            throw new Exception("Negative age cannot be assign");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                '}';
    }
}
