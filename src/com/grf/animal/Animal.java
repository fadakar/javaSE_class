package com.grf.animal;

public abstract class Animal {

    public Animal() {

    }

    protected String name;
    protected long weight;
    protected String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void sound();

    public abstract void eat();

    public abstract void sleep();

    public abstract void wakeup();


}
