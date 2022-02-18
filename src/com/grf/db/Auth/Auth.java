package com.grf.db.Auth;

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
            if (user.getPassword().equals(MD5(password.trim()))) {
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
        userBL.register(username, MD5(password.trim()));
    }


    private String MD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }
}
