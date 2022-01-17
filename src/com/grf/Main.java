package com.grf;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // names array
        String names[] = new String[2]; // byad hatman andaze array moshakhas shavad agar dynamic niyaz hast az ArrayList estefade mikonim
        names[0] = "ali";
        names[1] = "hasan";

       for (String name :names){
           System.out.println(name);
       }

       // numbers array
        int numbers[] = new int[2];
        numbers[0] = 44;
        numbers[1] = 56;

        for (int number :numbers){
            System.out.println(number);
        }

    }
}
