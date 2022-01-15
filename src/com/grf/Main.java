package com.grf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        do {
            try {
                System.out.print("print enter your age: ");
                String age = scanner.nextLine();
                int ageInt = Integer.parseInt(age);
                System.out.print("Your age is: ");
                System.out.println(ageInt);
                // String.valueOf(ageInt);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Your entered age is invalid");
            }
        } while (true);


    }
}
