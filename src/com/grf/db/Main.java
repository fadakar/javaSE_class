package com.grf.db;

public class Main {
    public static void main(String[] args) {
        try {
            PhoneBookManager phoneBookManager = new PhoneBookManager();
            phoneBookManager.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
