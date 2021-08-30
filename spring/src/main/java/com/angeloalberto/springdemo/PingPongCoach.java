package com.angeloalberto.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach{

    @Autowired
    private FortuneService fortuneService;

    public PingPongCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        fortuneService.addFortunes();
        fortuneService.getFortune();
        return "these are the random fortunes";
    }
}
