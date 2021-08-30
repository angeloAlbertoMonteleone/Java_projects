package com.angeloalberto.challenge.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if(radius < 0){
            this.radius = 0;
        }

        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public double getArea(){
        double area = (radius * radius * Math.PI);
        return area;
    }


}
