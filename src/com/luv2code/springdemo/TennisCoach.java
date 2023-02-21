package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println("Inside default constructor");
    }

    // Setter injection
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter method!");
        this.fortuneService = fortuneService;
    }
//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice forehand and backhand for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
