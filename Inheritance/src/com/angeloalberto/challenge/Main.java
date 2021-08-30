package com.angeloalberto.challenge;

public class Main {
    public static void main(String[] args) {
        Jeep jeepCar = new Jeep(36);
        jeepCar.handSteering(45);
        jeepCar.accelerate(30);
        jeepCar.accelerate(20);
        jeepCar.accelerate(-42);

        jeepCar.decreasing(4);

        jeepCar.accelerate(56);
        jeepCar.decreasing(40);
    }
}
