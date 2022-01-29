package com.grf.vehicle;

public class Peykan extends Car{
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void stop() {
        System.out.println("peykan stop");
    }

    @Override
    public String toString() {
        return "Peykan{" +
                "engine=" + engine +
                ", tire=" + tire +
                ", color='" + color + '\'' +
                '}';
    }
}
