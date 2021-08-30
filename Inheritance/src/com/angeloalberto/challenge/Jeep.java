package com.angeloalberto.challenge;

public class Jeep extends Car {

    private int roadServiceMonths;

    public Jeep(int roadServiceMonths) {
        super("Jeep", "4WD", 2, 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        }else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }else if(newVelocity > 30 && newVelocity <= 50){
            changeGear(4);
        }else if(newVelocity > 50 && newVelocity <= 70){
            changeGear(5);
        }else if(newVelocity > 70 && newVelocity <= 100){
            changeGear(6);
        }

        if(newVelocity > 0){
            System.out.println("Car.changeVelocity() : velocity " + newVelocity + " direction" + getCurrentDirection());
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

    public void decreasing(int rate){
        int newVelocity = getCurrentVelocity() - rate;

        if(newVelocity == 0){
            stop();
            changeGear(1);
        }else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }else if(newVelocity > 30 && newVelocity <= 50){
            changeGear(4);
        }else if(newVelocity > 50 && newVelocity <= 70){
            changeGear(5);
        }else if(newVelocity > 70 && newVelocity <= 100){
            changeGear(6);
        }

        if(newVelocity > 0){
            System.out.println("Car.changeVelocity() : velocity " + newVelocity + " direction" + getCurrentDirection());
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }




}
