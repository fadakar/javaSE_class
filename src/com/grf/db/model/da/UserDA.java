package com.grf.db.model.da;


import com.grf.db.Utils.DBConnection;
import com.grf.db.model.to.User;

import java.sql.*;
import java.util.ArrayList;

public class UserDA extends DBConnection {
    public UserDA() throws ClassNotFoundException {
    }

    // --------------------------- crud ----------------------------------- //

    public ArrayList<User> all() throws SQLException {
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user");
        ArrayList<User> users = new ArrayList<>();

        try {
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection(connection);
        return users;
    }

    public User find(int id) throws SQLException {
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user where id = " + id);
        User user = new User();
        try {
            if (resultSet.next()) {
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        closeConnection(connection);
        return user;
    }

    public User add(User user) throws SQLException {
        Connection connection = createConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO user(username,password) VALUES(?,?)");
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getPassword());
        statement.executeUpdate();
        closeConnection(connection);
        return user;
    }

    public User update(User user) throws SQLException {
        Connection connection = createConnection();
        PreparedStatement statement = connection.prepareStatement("UPDATE user SET username = ? , password = ? where id = ?");
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getPassword());
        statement.setInt(3, user.getId());
        statement.executeUpdate();
        closeConnection(connection);
        return user;
    }

    public void delete(int id) throws SQLException {
        Connection connection = createConnection();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM user where id = ?");
        statement.setInt(1, id);
        statement.executeUpdate();
        closeConnection(connection);
    }

    // --------------------------- crud ----------------------------------- //
}
