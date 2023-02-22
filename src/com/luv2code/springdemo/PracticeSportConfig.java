package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeSportConfig {

    @Bean
    public SingleFortuneService singleFortuneService() {
        return new SingleFortuneService();
    }

    @Bean
    public PingPongCoach pingPongCoach() {
        return new PingPongCoach(singleFortuneService());
    }
}
