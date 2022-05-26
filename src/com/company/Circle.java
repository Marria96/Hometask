package com.company;

public class Circle {
    private double radius;
    private double diameter;
    private double Pi = 3.14;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public double getSquare() {
         return diameter * Pi;
    }

    public double getLength() {
        return 2 * Pi * radius;
    }

}
