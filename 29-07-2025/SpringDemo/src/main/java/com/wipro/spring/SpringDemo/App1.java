package com.wipro.spring.SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wipro.springdemo.beans.Mobile;

public class App1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("com.wipro.springdemo.beans");
        ctx.refresh();

        Mobile mobile = ctx.getBean(Mobile.class);
        System.out.println(mobile);
    }
}
