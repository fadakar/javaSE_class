package com.grf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, z, t = 0;
        String formal = "( (%1$f +6) + %2$f)^2 * (%3$f / (%4$f +4)) / (%3$f * (%4$f + 4) ) + (%1$f - %4$f)";

        System.out.print("enter x:");
        x = scanner.nextDouble();

        System.out.print("enter y:");
        y = scanner.nextDouble();

        System.out.print("enter w:");
        z = scanner.nextDouble();

        System.out.print("enter t:");
        t = scanner.nextDouble();

        double answer = ((x + 6) + y);
        answer = Math.pow(answer, 2);
        answer = answer * (z / (t + 4)) / (z * (t + 4)) + (x - t);

        // -------------- print result -----------------
        System.out.print(answer);
        System.out.print(" = ");
        System.out.println(
                String.format(formal, x, y, z, t)
        );
    }
}
