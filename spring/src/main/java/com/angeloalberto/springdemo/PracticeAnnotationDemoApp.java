package com.angeloalberto.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("pingPongCoach", Coach.class);

        System.out.println(theCoach.getDailyFortune());

        context.close();
    }

}
