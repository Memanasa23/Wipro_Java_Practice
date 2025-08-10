package com.wipro.menu;

import com.wipro.Threads.NumbersThreads;

public class Ex1 {
    public static void main(String[] args) {
        NumbersThreads t1 = new NumbersThreads();
        Alphabetics t2 = new Alphabetics();

        t1.start();
        t2.start();
    }
}
