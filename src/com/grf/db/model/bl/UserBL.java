package com.grf.db.model.bl;

import com.grf.db.model.da.UserDA;
import com.grf.db.model.to.User;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserBL {

    private UserDA userDA;

    public UserBL() throws ClassNotFoundException {
        userDA = new UserDA();
    }

    public ArrayList<User> all() throws SQLException {
        return userDA.all();
    }

    public User find(int id) throws SQLException {
        return userDA.find(id);
    }

    public User findByUsername(String username) throws SQLException {
        for (User user : all()) {
            if (user.getUsername().equals(username.toLowerCase())) {
                return user;
            }
        }
        return null;
    }

    public void add(User model) throws SQLException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        userDA.add(model);
    }

    public void update(User model) throws SQLException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        userDA.update(model);
    }

    public void delete(int id) throws SQLException {
        userDA.delete(id);
    }

    public void register(String username, String password) throws SQLException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userDA.add(user);
    }
}
