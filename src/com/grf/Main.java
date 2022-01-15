package com.grf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("print enter your age: ");
        String age =  scanner.nextLine();
        int ageInt = Integer.parseInt(age);
        System.out.println(ageInt);
//        String.valueOf(ageInt);

    }
}
