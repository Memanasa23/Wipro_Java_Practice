package com.wipro.menu;

import com.wipro.model.Counter;
import com.wipro.Threads.CounterThreads;

public class Ex3 {
    public static void main(String[] args) throws InterruptedException {
        Counter t = new Counter();

        CounterThreads t1 = new CounterThreads(t);
        CounterThreads t2 = new CounterThreads(t);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t.getCount());
    }
}