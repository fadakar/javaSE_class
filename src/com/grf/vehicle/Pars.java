package com.grf.vehicle;

public class Pars extends Car{

  protected int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void stop() {
        System.out.println("Pars stop");
    }

    @Override
    public String toString() {
        return "Pars{" +
                "engine=" + engine +
                ", tire=" + tire +
                ", weight=" + weight +
                '}';
    }
}
