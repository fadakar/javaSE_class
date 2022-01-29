package com.grf.vehicle;

public class Engine {

    public Engine(){

    }
    private int hp;
    private int cylandrCount;


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCylandrCount() {
        return cylandrCount;
    }

    public void setCylandrCount(int cylandrCount) {
        this.cylandrCount = cylandrCount;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "hp=" + hp +
                ", cylandrCount=" + cylandrCount +
                '}';
    }
}
