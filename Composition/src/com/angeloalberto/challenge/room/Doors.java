package com.angeloalberto.challenge.room;

public class Doors {
    private String material;
    private int height;
    private int width;

    public Doors(String material, int height, int width) {
        this.material = material;
        this.height = height;
        this.width = width;
    }

    public void openingDoor(){
        System.out.println("The door is opening");
    }

    public String getMaterial() {
        return material;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
