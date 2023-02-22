package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeMainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PracticeSportConfig.class);

        Coach myPingPongCoach = context.getBean("pingPongCoach", Coach.class);

        System.out.println(myPingPongCoach.getDailyFortune());
        System.out.println(myPingPongCoach.getDailyWorkout());

        context.close();
    }
}
