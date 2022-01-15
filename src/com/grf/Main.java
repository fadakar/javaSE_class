package com.grf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // -------------- get user firstname and lastname --------------
        System.out.print("Enter Your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Your national code: ");
        String code = scanner.nextLine();

        System.out.print("Enter Your age: ");
        int age = scanner.nextInt();


        // -------------- print result ----------------
        System.out.println("full name: " + firstName + " " + lastName);
        System.out.println("national code: " + code);
        System.out.println("age: " + age);

    }
}
