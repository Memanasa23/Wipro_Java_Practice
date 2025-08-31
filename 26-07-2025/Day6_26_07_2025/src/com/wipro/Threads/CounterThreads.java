package com.wipro.Threads;

import com.wipro.model.Counter;

public class CounterThreads extends Thread{
	private final Counter t;

    public CounterThreads(Counter t) {
        this.t = t;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            t.increment();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exp) {
                exp.printStackTrace();
            }
        }
    }

}
