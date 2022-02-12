package com.grf.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
