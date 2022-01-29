package com.grf;

import com.grf.vehicle.*;

public class Main {
    public static void main(String[] args) {

        Peykan paykan = new Peykan();

        // ---------- set engine -----------
        Engine perykanEngine = new Engine();
        perykanEngine.setHp(70);
        perykanEngine.setCylandrCount(4);
        paykan.setEngine(perykanEngine);

        // ---------- set tire -----------
        Tire peykanTire = new Tire();
        peykanTire.setBrand("barez");
        peykanTire.setSize(15);
        paykan.setTire(peykanTire);
        paykan.setColor("Red");

        System.out.println(paykan);
        System.out.println("==========================");

        Pars pars = new Pars();

        // ---------- set engine -----------
        Engine parsEngine = new Engine();
        parsEngine.setHp(70);
        parsEngine.setCylandrCount(4);
        pars.setEngine(parsEngine);

        // ---------- set tire -----------
        Tire parsTire = new Tire();
        parsTire.setBrand("barez");
        parsTire.setSize(15);
        pars.setTire(parsTire);
        pars.setWeight(1100);

        System.out.println(pars);


    }

}
