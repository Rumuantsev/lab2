package org.example.geometry3d;

import org.example.geometry2d.Circle;


public class Cylinder {
    private double radiusBase;
    private double height;
    Circle base = new Circle(radiusBase);

    public Cylinder(double radiusBase, double height){
        this.radiusBase = radiusBase;
        this.height = height;
    }

    public double volume(){
        double PI = Math.PI;
        return PI * radiusBase * 2 * height;
    }
}
