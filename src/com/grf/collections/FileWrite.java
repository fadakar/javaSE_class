package com.grf.collections;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {

            File file = new File("info.txt");
            FileWriter fileWrite = new FileWriter(file);
            fileWrite.write("Welcome to java io");
            fileWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
