package com.grf.vehicle;

public abstract class Car {

    public Car() {

    }

    protected Engine engine;
    protected Tire tire;


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void move() {
        System.out.println("Car Moving");
    }

    public abstract void stop();

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", tire=" + tire +
                '}';
    }
}
