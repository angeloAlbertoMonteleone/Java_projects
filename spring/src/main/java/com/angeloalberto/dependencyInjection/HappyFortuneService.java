package com.angeloalberto.dependencyInjection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HappyFortuneService implements FortuneService{
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public void addFortunes() {
        arrayList.add("Java");
        arrayList.add("Spring");
        arrayList.add("Dependency injection");
    }

    @Override
    public String getFortune() {
        Collections.shuffle(arrayList);
        System.out.println("random values : ");
        for (String random_value : arrayList){
            return random_value;
        }
        return null;
    }
}
