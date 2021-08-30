package com.angeloalberto.challenge.cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("cicle.radius " + circle.getRadius());
        System.out.println("cicle.area " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius " + cylinder.getRadius());
        System.out.println("cylinder.heigth " + cylinder.getHeight());
        System.out.println("cylinder.area " + cylinder.getArea());
        System.out.println("cylinder.volume " + cylinder.getVolume());
    }
}
