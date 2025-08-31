package com.wipro.Day3_24_07_2025;

public class GenericBox<T> {  

    private T item; 

    
    public void add(T item) {
        this.item = item;
    }

    
    public T get() {
        return item;
    }

    
    public static void main(String[] args) {
        
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.add("Hello, Sneha!");
        System.out.println("String Box contains: " + stringBox.get());

        
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.add(123);
        System.out.println("Integer Box contains: " + intBox.get());

        
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.add(45.67);
        System.out.println("Double Box contains: " + doubleBox.get());
    }
}

