package com.grf.db.test;

import com.grf.db.Utils.BaseDA;
import com.grf.db.model.to.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class MyPersonDA extends BaseDA<Person> {

    public MyPersonDA() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        table = "person";
        primaryKey = "id";
        fields = new ArrayList<>(Arrays.asList("id", "name","number"));
    }

    @Override
    protected Connection createConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
    }

    @Override
    protected Person newInstance() {
        return new Person();
    }
}
