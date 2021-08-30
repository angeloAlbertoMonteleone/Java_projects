package com.angeloalberto;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I' m nor very good at that, I can swim");
    }
}
