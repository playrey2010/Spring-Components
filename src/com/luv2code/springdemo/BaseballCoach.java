package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Autowired
    @Qualifier("fromFileFortuneService")
    private FortuneService fortuneService;

    public BaseballCoach() {
    }

//    @Autowired
//    public void doSettingMyWay(FortuneService fortuneService){
//        System.out.println("Custom method injection happening now! (this.fortuneService = fortuneService;)");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your swing";
    }

    @Override
    public String getDailyFortune() {
        return "Baseball Coach said: \"" + fortuneService.getFortune() + ".\"";
    }
}
