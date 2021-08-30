package com.angeloalberto.springdemo;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HappyFortuneService implements FortuneService {

    private List<String> theFortunes;

    //create a random number generator
    private Random myRandom = new Random();


    @Override
    public void addFortunes() {
        theFortunes.add("Java");
        theFortunes.add("Spring");
        theFortunes.add("Dependency injection");
    }

    @Override
    public String getFortune() {
        Collections.shuffle(theFortunes);
        System.out.println("random values : ");
        for (String random_value : theFortunes){
            System.out.println(random_value);
        }
        return "get fortune";
    }
}
