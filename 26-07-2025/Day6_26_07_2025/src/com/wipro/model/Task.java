package com.wipro.model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NumberPrinter implements Runnable {
    private final String a;

    public NumberPrinter(String a) {
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + ": " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException exp) {
                exp.printStackTrace();
            }
        }
    }
}

public class Task {
    public static void main(String[] args) {
        ExecutorService t = Executors.newFixedThreadPool(5); 

        for (int i = 1; i <= 5; i++) {
            Runnable b = new NumberPrinter("Task-" + i);
            t.execute(b);
        }

        t.shutdown(); 
    }
}

