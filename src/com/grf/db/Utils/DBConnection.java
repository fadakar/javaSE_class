package com.grf.db.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DBConnection {

    public DBConnection() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }

    protected Connection createConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/java_phonebook", "root", "");
    }

    protected void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
