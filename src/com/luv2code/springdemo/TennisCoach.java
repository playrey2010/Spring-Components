package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println("Inside default constructor");
    }

    // For PostConstruct and PreDestroy annotations, void return type is preferred as any returned value is not retrievable
    // Must be no-arg methods

    @PostConstruct
    public void doMyStartupStuff() {

    }
    // For PostConstruct and PreDestroy annotations, void return type is preferred as any returned value is not retrievable
    // Must be no-arg methods
    @PreDestroy
    public void doMyCleanupStuff() {

    }
//    // Setter injection
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("Inside setter method!");
//        this.fortuneService = fortuneService;
//    }
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
