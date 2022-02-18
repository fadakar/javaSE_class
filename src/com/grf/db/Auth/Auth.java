package com.grf.db.Auth;

import com.grf.db.Utils.Hash;
import com.grf.db.model.bl.UserBL;
import com.grf.db.model.to.User;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class Auth {

    private User user;
    private UserBL userBL;

    public Auth() throws ClassNotFoundException {
        userBL = new UserBL();
    }

    public int getId() {
        if (user != null) {
            return user.getId();
        }
        return 0;
    }

    public User getUser() {
        return user;
    }

    public boolean check() {
        if (user != null) {
            return true;
        }
        return false;
    }

    public boolean login(String username, String password) throws SQLException {
        User user = userBL.findByUsername(username);
        if (user != null) {
            if (user.getPassword().equals(Hash.MD5(password.trim()))) {
                this.user = user;
                return true;
            }
        }
        return false;
    }

    public void logout() {
        user = null;
    }

    public void register(String username, String password) throws SQLException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        userBL.register(username, Hash.MD5(password.trim()));
    }


}
