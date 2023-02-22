package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig  {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean // The name of the method (here, swimCoach() ) determines the beanID (swimCoach)
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
