package com.jetbulb.interviews.concurrency.race;

public class CounterRunner {
    public static void main(String[] args) {
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();

    }

}

class Counter implements Runnable {
    public static int c;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            c++;
        }
        System.out.printf("%s : %s%n", Thread.currentThread().getName(), c);
    }
}
