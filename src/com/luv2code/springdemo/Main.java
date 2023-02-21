package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach mySillyCoach = context.getBean("thatSillyCoach", Coach.class);

        System.out.println(mySillyCoach.getDailyWorkout());

        context.close();
    }
}
