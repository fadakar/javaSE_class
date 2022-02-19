package com.grf.thread;

public class Main {
    public static void main(String[] args) {

        try {
            int i = 0;
            while (true) {
//               Thread.sleep(500);
                Primer primer = new Primer(i);
                Thread thread = new Thread(primer);
                thread.start();
                i++;
//               System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
