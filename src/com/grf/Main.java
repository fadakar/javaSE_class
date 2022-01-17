package com.grf;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        int selectNumber = rnd.nextInt(100);
        System.out.println("We are selected number between 0 to 100, guess it");
        Scanner scanner = new Scanner(System.in);
        int counter = 1;

        do {
            System.out.print("Enter Your guess number:");
            int clientNumber = scanner.nextInt();
            if (clientNumber == selectNumber) {
                break;
            } else if (selectNumber > clientNumber) {
                System.out.println("my number is bigger than " + clientNumber);
            } else if (selectNumber < clientNumber) {
                System.out.println("my number is smaller than " + clientNumber);
            }
            counter++;
        } while (true);

        System.out.println("You found number " + selectNumber + " by " + counter + " guess");
    }
}
