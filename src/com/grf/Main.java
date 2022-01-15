package com.grf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Enter Your first name: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter Your last name: ");
                String lastName = scanner.nextLine();

                System.out.print("Enter Your national code: ");
                String code = scanner.nextLine();

                System.out.print("Enter Your birthday: ");
                String birthday = scanner.nextLine();

                System.out.print("print enter your age: ");
                String age = scanner.nextLine();
                int ageInt = Integer.parseInt(age);
                ageInt += 2;

                // -------------- print result ----------------
                System.out.println("-------------------------------------");
                System.out.println("full name: " + firstName + " " + lastName);
                System.out.println("national code: " + code);
                System.out.println("birthday: " + birthday);
                System.out.print("Your age is: ");
                System.out.println(ageInt);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Your entered age is invalid");
            }
        } while (true);


    }
}
