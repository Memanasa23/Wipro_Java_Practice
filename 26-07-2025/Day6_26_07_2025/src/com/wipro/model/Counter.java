package com.wipro.model;

public class Counter {
	int c = 0;

    public synchronized void increment() {
        c++;
    }

    public int getCount() {
        return c;
    }

}
