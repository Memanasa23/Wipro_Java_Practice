package com.wipro.Threads;

public class NumbersThreads extends Thread {
	public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException exp) {
                exp.printStackTrace();
            }
        }
    }

}
