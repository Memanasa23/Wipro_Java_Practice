package com.wipro.menu;

public class Alphabetics extends Thread {
	public void run() {
        for (char a = 'A'; a <= 'J'; a++) {
            System.out.println("Alphabet " + a);
            try {
                Thread.sleep(200);
            } catch (InterruptedException exp) {
                exp.printStackTrace();
            }
        }
    }

}
