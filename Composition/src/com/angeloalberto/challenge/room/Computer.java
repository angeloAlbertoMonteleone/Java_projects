package com.angeloalberto.challenge.room;

import com.angeloalberto.Resolution;

public class Computer {
    private String model;
    private String manufacturer;
    private int size;

    public Computer(String model, String manufacturer, int size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public void startingUp(){
        System.out.println("The computer is starting up");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }
}
