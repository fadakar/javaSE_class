package com.grf.thread;

public class Primer implements Runnable {

    private int number;

    public Primer( int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (Primer.isPrime(number)) {
            System.out.println("Founded: " + number);
        }
    }

    public static boolean isPrime(int num) {
        boolean status = false;
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                status = true;
                break;
            }
        }

        return !status;
    }
}
