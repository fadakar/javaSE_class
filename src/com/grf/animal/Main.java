package com.grf.animal;

public class Main {
    public static void main(String[] args) {
        Auth.login("ali", "122342Adf");
        System.out.println(Auth.getUser());

        Auth.logout();
    }
}
