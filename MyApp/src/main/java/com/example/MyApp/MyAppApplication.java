package com.example.MyApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Dev obj = context.getBean("dev", Dev.class);
        obj.build();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
