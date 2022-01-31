package com.grf.animal;

public class Main {
    public static void main(String[] args) {
        Khazande temsah = new Khazande();
        temsah.setDozist(true);
        temsah.setName("temsah");
        temsah.setWeight(500);
        temsah.setColor("green");
        System.out.println(temsah);
        System.out.println("==================================");

        Parande toti = new Parande();
        toti.setTedadBal(2);
        toti.setColor("yellow");
        toti.setName("toti");
        toti.setWeight(1);
        System.out.println(toti);

    }
}
