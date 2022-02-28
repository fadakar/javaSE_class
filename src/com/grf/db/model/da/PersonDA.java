package com.grf.db.model.da;

import com.grf.db.Utils.DBConnection;
import com.grf.db.model.to.Person;

import java.sql.*;
import java.util.ArrayList;

public class PersonDA extends DBConnection {


    public PersonDA() throws ClassNotFoundException {
    }


    // --------------------------- crud ----------------------------------- //

    public ArrayList<Person> all() throws SQLException {
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM person");
        ArrayList<Person> people = new ArrayList<>();

        try {
            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getInt(1));
                person.setName(resultSet.getString(2));
                person.setNumber(resultSet.getString(3));
                person.setUserId(resultSet.getInt(4));
                people.add(person);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection(connection);
        return people;
    }

    public Person find(int id) throws SQLException {
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM person where id = " + id);
        Person person = new Person();
        try {
            if (resultSet.next()) {
                person.setId(resultSet.getInt(1));
                person.setName(resultSet.getString(2));
                person.setNumber(resultSet.getString(3));
                person.setUserId(resultSet.getInt(4));
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        closeConnection(connection);
        return person;
    }

    public Person add(Person person) throws SQLException {
        Connection connection = createConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO person(name,number,userId) VALUES(?,?,?)");
        statement.setString(1, person.getName());
        statement.setString(2, person.getNumber());
        statement.setInt(3, person.getUserId());
        statement.executeUpdate();
        closeConnection(connection);
        return person;
    }

    public Person update(Person person) throws SQLException {
        Connection connection = createConnection();
        PreparedStatement statement = connection.prepareStatement("UPDATE person SET name = ? , number = ? where id = ?");
        statement.setString(1, person.getName());
        statement.setString(2, person.getNumber());
        statement.setInt(3, person.getId());
        statement.executeUpdate();
        closeConnection(connection);
        return person;
    }

    public void delete(int id) throws SQLException {
        Connection connection = createConnection();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM person where id = ?");
        statement.setInt(1, id);
        statement.executeUpdate();
        closeConnection(connection);
    }

    // --------------------------- crud ----------------------------------- //


    public ArrayList<Person> searchByName(String name) throws SQLException {
        Connection connection = createConnection();
        ArrayList<Person> people = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM person WHERE name LIKE ?");
        statement.setString(1, "%" + name + "%");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Person person = new Person();
            person.setId(resultSet.getInt(1));
            person.setName(resultSet.getString(2));
            person.setNumber(resultSet.getString(3));
            person.setUserId(resultSet.getInt(4));
            people.add(person);
        }
        closeConnection(connection);
        return people;
    }

    public ArrayList<Person> searchByNumber(String number) throws SQLException {
        Connection connection = createConnection();
        ArrayList<Person> people = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM person WHERE number = ?");
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

    public void deleteByIdAndUserId(int id, int userId) throws SQLException {
        Connection connection = createConnection();
        PreparedStatement st = connection.prepareStatement("DELETE FROM person WHERE  id = ? AND userId = ?");
        st.setInt(1, id);
        st.setInt(2, userId);
        st.executeUpdate();
        closeConnection(connection);
    }
}
