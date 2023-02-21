package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
        Coach mySillyCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(mySillyCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(mySillyCoach.getDailyFortune());

        context.close();
    }
}
