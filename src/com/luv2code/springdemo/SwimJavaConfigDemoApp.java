package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // Read spring config java file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        // Retrieve bean from Spring container
        Coach mySwimCoach = context.getBean("swimCoach", Coach.class);

        System.out.println(mySwimCoach.getDailyFortune());

        context.close();


    }
}
