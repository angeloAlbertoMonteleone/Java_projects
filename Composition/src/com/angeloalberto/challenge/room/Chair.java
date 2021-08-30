package com.angeloalberto.challenge.room;

public class Chair {
    private String material;
    private int height;
    private int width;
    private String shape;
    private int numbers;

    public Chair(String material, int height, int width, String shape, int numbers) {
        this.material = material;
        this.height = height;
        this.width = width;
        this.shape = shape;
        this.numbers = numbers;
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

    public String getShape() {
        return shape;
    }

    public int getNumbers() {
        return numbers;
    }
}
