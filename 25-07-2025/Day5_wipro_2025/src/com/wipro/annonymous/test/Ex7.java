package com.wipro.annonymous.test;

import java.util.function.Consumer;

public class Ex7 {
    public static void main(String[] args) {
        
        Consumer<Integer> NextEven = n -> {
            int res = (n % 2 == 0) ? n + 2 : n + 1;
            System.out.println("Even number next " + res);
        };

        
        NextEven.accept(155);     
        NextEven.accept(39);   
        NextEven.accept(65);   
    }
}

