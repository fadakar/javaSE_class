package com.grf.hash;

import java.security.MessageDigest;

public class Main {
    public static void main(String[] args) {
        try {
            String password = "test23443";
            byte[] bytesOfMessage = password.getBytes("UTF-8");

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] theMD5digest = md.digest(bytesOfMessage);
            System.out.println(theMD5digest);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
