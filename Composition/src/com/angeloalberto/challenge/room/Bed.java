package com.angeloalberto.challenge.room;

public class Bed {
    private String material;
    private int height;
    private int width;
    private int length;

    public Bed(String material, int height, int width, int length) {
        this.material = material;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void make(){
        System.out.println("making bed");
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

    public int getLength() {
        return length;
    }
}
