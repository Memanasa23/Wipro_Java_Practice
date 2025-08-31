package com.wipro.springdemo.beans;

import org.springframework.stereotype.Component;

@Component
public class Display {
    int size;

    public Display() {
        this.size = 23;  
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Display [size=" + size + "]";
    }
}
