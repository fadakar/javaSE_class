package com.grf.db.model.da;

import com.grf.db.model.to.Person;

import java.sql.*;
import java.util.ArrayList;

public class PersonDA {

    public PersonDA() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }

    public ArrayList<Person> all() throws SQLException {
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from person");
        ArrayList<Person> persons = new ArrayList<>();

        try {
            while (rs.next()) {
                Person person = new Person();
                person.setId(rs.getInt(1));
                person.setName(rs.getString(2));
                person.setNumber(rs.getString(3));
                persons.add(person);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection(connection);
        return persons;
    }

    public void add(Person person) throws SQLException {
        Connection connection = createConnection();
        PreparedStatement st = connection.prepareStatement("insert into person values(?,?,?)");
        st.setInt(1, person.getId());
        st.setString(2, person.getName());
        st.setString(3, person.getNumber());
        st.executeUpdate();
        closeConnection(connection);
    }

    public void update(Person person) throws SQLException {
        Connection connection = createConnection();
        PreparedStatement st = connection.prepareStatement("update person  set name=?,number=? where id=?");
        st.setString(1, person.getName());
        st.setString(2, person.getNumber());
        st.setInt(3, person.getId());
        st.executeUpdate();
        closeConnection(connection);
    }

    public void delete(int id) throws SQLException {
        Connection connection = createConnection();
        PreparedStatement st = connection.prepareStatement("delete from person where id=?");
        st.setInt(1, id);
        st.executeUpdate();
        closeConnection(connection);
    }

    private Connection createConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
    }

    private void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
