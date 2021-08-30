package com.angeloalberto.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    //add new fields for emailAddress and team
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void getRandomFortune(){
        fortuneService.addFortunes();
        fortuneService.getFortune();
    }

    // our getter method
    public FortuneService getFortuneService() {
        return fortuneService;
    }

    // our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: i m inside the setter method");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: i m inside the setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: i m inside the setter method - setTeam");
        this.team = team;
    }
}
