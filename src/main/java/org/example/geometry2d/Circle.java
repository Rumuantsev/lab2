package org.example.geometry2d;

import static java.lang.Math.pow;

public class Circle implements Figure {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        double PI = Math.PI;
        return PI * pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Radius: " + String.valueOf(this.radius) + "\nArea: " + String.valueOf(this.area());
    }
}
