package com.grf.animal;

public class Khazande extends Animal {
    protected boolean dozist;

    public boolean isDozist() {
        return dozist;
    }

    public void setDozist(boolean dozist) {
        this.dozist = dozist;
    }


    @Override
    public void sound() {
        System.out.println("[khazande]: " + super.name + " sound");
    }

    @Override
    public void eat() {
        System.out.println("[khazande]: " + super.name + " eat");
    }

    @Override
    public void sleep() {
        System.out.println("[khazande]: " + super.name + " sleep");
    }

    @Override
    public void wakeup() {
        System.out.println("[khazande]: " + super.name + " wakeup");
    }

    @Override
    public String toString() {
        return "Khazande{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", dozist=" + dozist +
                '}';
    }
}
