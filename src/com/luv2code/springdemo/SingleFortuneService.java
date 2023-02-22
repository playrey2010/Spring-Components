package com.luv2code.springdemo;

public class SingleFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Memento Mori <3";
    }
}
