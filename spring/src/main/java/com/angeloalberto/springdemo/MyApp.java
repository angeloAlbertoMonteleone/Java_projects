package com.angeloalberto.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        //create a spring container
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);


        //create obj
        Coach myCoach = new TrackCoach();

        //use obj
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());

    }
}
