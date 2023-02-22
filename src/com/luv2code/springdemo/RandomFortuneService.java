package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    // create an array of Strings
    private String[] fortuneArray = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"};
    private Random myRandomizer = new Random();
    @Override
    public String getFortune() {
        int randomInt = myRandomizer.nextInt(fortuneArray.length);
        return fortuneArray[randomInt];
    }
}
