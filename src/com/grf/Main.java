package com.grf;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, answer, selectMenu = 0;

        do {
            System.out.println("[1]: +");
            System.out.println("[2]: -");
            System.out.println("[3]: *");
            System.out.println("[4]: /");
            System.out.println("[5]: exit");
            System.out.print("select Menu: ");
            selectMenu = scanner.nextInt();
            switch (selectMenu) {
                case 1:
                    System.out.print("Enter Number 1:");
                    number1 = scanner.nextInt();
                    System.out.print("Enter Number 2:");
                    number2 = scanner.nextInt();
                    answer = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + answer);
                    break;
                case 2:
                    System.out.print("Enter Number 1:");
                    number1 = scanner.nextInt();
                    System.out.print("Enter Number 2:");
                    number2 = scanner.nextInt();
                    answer = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + answer);
                    break;
                case 3:
                    System.out.print("Enter Number 1:");
                    number1 = scanner.nextInt();
                    System.out.print("Enter Number 2:");
                    number2 = scanner.nextInt();
                    answer = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + answer);
                    break;
                case 4:
                    System.out.print("Enter Number 1:");
                    number1 = scanner.nextInt();
                    System.out.print("Enter Number 2:");
                    number2 = scanner.nextInt();
                    answer = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + answer);
                    break;
                case 5:
                    System.exit(0);

            }
            System.out.println("---------------------------------");
        } while (true);

    }
}
