package com.grf.db.model.da;

import com.grf.db.Utils.BaseDA;
import com.grf.db.model.to.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class PersonDA extends BaseDA<Person> {

    public PersonDA() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        table = "person";
        primaryKey = "id";
        fields = new ArrayList<>(Arrays.asList("id", "name", "number"));
    }

    @Override
    protected Connection createConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
    }

    @Override
    protected Person newInstance() {
        return new Person();
    }

    public ArrayList<Person> searchByName(String name) throws SQLException {
        Connection connection = createConnection();
        ArrayList<Person> people = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement("select * from " + table + " where name like ?");
        statement.setString(1, "%" + name + "%");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Person person = new Person();
            person.setId(resultSet.getInt(1));
            person.setName(resultSet.getString(2));
            person.setNumber(resultSet.getString(3));
            people.add(person);
        }
        closeConnection(connection);
        return people;
    }

    public ArrayList<Person> searchByNumber(String number) throws SQLException {
        Connection connection = createConnection();
        ArrayList<Person> people = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement("select * from " + table + " where number = ?");
        statement.setString(1, number);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Person person = new Person();
            person.setId(resultSet.getInt(1));
            person.setName(resultSet.getString(2));
            person.setNumber(resultSet.getString(3));
            people.add(person);
        }
        closeConnection(connection);
        return people;
    }
}
