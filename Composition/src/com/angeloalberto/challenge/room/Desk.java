package com.angeloalberto.challenge.room;

public class Desk {
    private String material;
    private int height;
    private int width;
    private String shape;

    public Desk(String material, int height, int width, String shape) {
        this.material = material;
        this.height = height;
        this.width = width;
        this.shape = shape;
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
}
