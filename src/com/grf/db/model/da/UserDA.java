package com.grf.db.model.da;

import com.grf.db.Utils.BaseDA;
import com.grf.db.model.to.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class UserDA extends BaseDA<User> {

    public UserDA() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        table = "user";
        primaryKey = "id";
        fields = new ArrayList<>(Arrays.asList("id", "username", "password"));
        gaurd = new ArrayList<>(Arrays.asList("id"));
    }

    @Override
    protected Connection createConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
    }

    @Override
    protected User newInstance() {
        return new User();
    }
}
