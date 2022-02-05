package com.grf.animal;

public class Auth {
    private static User user;

    public static User getUser() {
        return user;
    }

    public static User login(String username, String password) {
        if (user == null) {
            user = new User();
            user.setUsername(username);
            user.setPassword(password);
        }
        return user;
    }


    public static void logout() {
        user = null;
    }
}
