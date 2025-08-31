package com.wipro.Day3_24_07_2025;

import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        
        Map<String, String> currencyMap = new HashMap<>();
        currencyMap.put("USD", "United States Dollar");
        currencyMap.put("INR", "Indian Rupee");
        currencyMap.put("EUR", "Euro");
        currencyMap.put("JPY", "Japanese Yen");
        currencyMap.put("GBP", "British Pound");

        
        List<Map.Entry<String, String>> list = new ArrayList<>(currencyMap.entrySet());
        list.sort(Map.Entry.comparingByValue());

        
        for (Map.Entry<String, String> entry : list) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

