package com.grf;


public class Main {

    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        mobile.model = "Iphone 13";
        mobile.color = "gray";
        mobile.charge = 80;
        mobile.number = "0912000000";

        System.out.println(mobile.toString());

    }
}
