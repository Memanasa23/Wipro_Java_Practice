package com.wipro.spring.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springdemo.beans.College;


public class App {
    public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        College college = ctx.getBean(College.class);
        System.out.println(college);
    }
}
