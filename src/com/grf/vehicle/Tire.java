package com.grf.vehicle;

public class Tire {
    public Tire(){

    }

    private int size;
    private String brand;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Tire{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                '}';
    }
}
