package com.angeloalberto.challenge.room;

public class Table {
    private Chair chair;
    private String material;
    private int height;
    private int width;
    private String shape;

    public Table(Chair chair, String material, int height, int width, String shape) {
        this.chair = chair;
        this.material = material;
        this.height = height;
        this.width = width;
        this.shape = shape;
    }

    public Chair getChair() {
        return chair;
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
