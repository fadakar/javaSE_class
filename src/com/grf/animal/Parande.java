package com.grf.animal;

public class Parande extends Animal {

    public Parande() {
    }

    protected int tedadBal;

    public int getTedadBal() {
        return tedadBal;
    }

    public void setTedadBal(int tedadBal) {
        this.tedadBal = tedadBal;
    }

    @Override
    public void sound() {
        System.out.println("[parande]: " + super.name + " sound");
    }

    @Override
    public void eat() {
        System.out.println("[parande]: " +super.name + " eat");
    }

    @Override
    public void sleep() {
        System.out.println("[parande]: " +super.name + " sleep");
    }

    @Override
    public void wakeup() {
        System.out.println("[parande]: " +super.name + " wakeup");
    }

    @Override
    public String toString() {
        return "Parande{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", tedadBal=" + tedadBal +
                '}';
    }
}
