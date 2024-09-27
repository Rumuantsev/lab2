package org.example.geometry2d;

import static java.lang.Math.pow;
import org.example.Exception.RadiusException;

public class Circle implements Figure {
    private double radius;
    public Circle(double radius) {
        try {
            if (radius <= 0){
                throw new RadiusException("Radius must be > 0!");
            }
            this.radius=radius;
        } catch (RadiusException e){
            System.err.print("Exception: " + e.getMessage());
        }
    }

    @Override
    public double area() {
        double PI = Math.PI;
        return PI * pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Radius: " + this.radius + "\nArea: " + this.area();
    }
}
