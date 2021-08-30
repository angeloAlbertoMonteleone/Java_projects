package com.angeloalberto.challenge.room;

public class TheWindows {
    private String material;
    private int height;
    private int width;

    public TheWindows(String material, int height, int width) {
        this.material = material;
        this.height = height;
        this.width = width;
    }

    public void openingWindows(){
        System.out.println("The windows are opening");
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
