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
                System.out.println(
                        String.format("my number is bigger than %1$d", clientNumber)
                );
            } else if (selectNumber < clientNumber) {
                System.out.println(
                        String.format("my number is smaller than %1$d", clientNumber)
                );
            }
            counter++;
        } while (true);

        System.out.println(
                String.format("You found number %1$d by %2$d guess", selectNumber, counter)
        );
    }
}
