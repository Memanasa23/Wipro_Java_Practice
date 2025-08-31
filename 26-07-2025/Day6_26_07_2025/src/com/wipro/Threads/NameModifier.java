package com.wipro.Threads;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class NameModifier {
    public static void main(String[] args) {
  
        List<String> names = new ArrayList<>(Arrays.asList("Amit", "Jayanta", "Emma", "Suresh", "Isha", "Ravi"));
        
        String vow = "AEIOUaeiou";

        Runnable vowel = () -> {
            for (int i = 0; i < names.size(); i++) {
                String s = names.get(i);
                if (!s.isEmpty() && vow.indexOf(s.charAt(0)) != -1) {
                    names.set(i, s.toUpperCase());
                }
            }
        };
        
        Runnable consonant = () -> {
            for (int i = 0; i < names.size(); i++) {
                String t = names.get(i);
                if (!t.isEmpty() && vow.indexOf(t.charAt(0)) == -1) {
                    names.set(i, t.toLowerCase());
                }
            }
        };
        
        
        Thread t1 = new Thread(vowel);
        Thread t2 = new Thread(consonant);
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }
        
       
        System.out.println(names);
    }
}