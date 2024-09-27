package org.example.geometry3d;

import org.example.geometry2d.Circle;
import org.example.Exception.RadiusBaseException;
import org.example.Exception.HeightException;
import org.example.geometry2d.Figure;


public class Cylinder {
    private Figure base;
    private final double height;

    public Cylinder(double radiusBase, double height) throws RadiusBaseException, HeightException{
            if (radiusBase <= 0){
                throw new RadiusBaseException("RadiusBase must be > 0!");
            } else if (height <= 0) {
                throw new HeightException("Height must be > 0!");
            }
            this.height = height;
            base = new Circle(radiusBase);
    }

    public double volume(){
        return base.area() * height;
    }
}
