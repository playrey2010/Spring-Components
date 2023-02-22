package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        // Use Spring Java Config Class we created (SportConfig.java)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        // retrieve bean from Spring Container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
        // Check to see if they are the same object
        boolean result = theCoach.equals(alphaCoach);

        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        // close the context
        context.close();
    }
}
