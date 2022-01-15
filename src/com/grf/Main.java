package com.grf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // -------------- get user firstname and lastname --------------
        System.out.print("Enter Your first name:");
        String firstName = scanner.nextLine();
        System.out.print("Enter Your last name:");
        String lastName = scanner.nextLine();

        // -------------- print result ----------------
        System.out.println("Your full name is: " + firstName + " " + lastName);

    }
}
