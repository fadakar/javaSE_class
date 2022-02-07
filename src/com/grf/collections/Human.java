package com.grf.collections;

import java.util.ArrayList;

public class Human {
    private String name;
    private ArrayList<House> houses;

    public Human() {
        houses = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<House> getHouses(){
        return houses;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", houses=" + houses +
                '}';
    }
}
