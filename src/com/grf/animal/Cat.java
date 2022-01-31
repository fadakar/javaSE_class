package com.grf.animal;

public class Cat implements IAnimal , IPet{

    @Override
    public void sound() {
        System.out.println("cat sound");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleep");
    }

    @Override
    public void wakeup() {
        System.out.println("cat sleep");
    }

    @Override
    public void goHome() {
        System.out.println("cat sleep");
    }
}
