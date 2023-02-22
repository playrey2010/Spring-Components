package com.luv2code.springdemo;

public class PingPongCoach implements Coach {

    private FortuneService fortuneService;

    public PingPongCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Work legs with medicine ball for 20 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
