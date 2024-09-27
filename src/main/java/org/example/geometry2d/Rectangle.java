package org.example.geometry2d;

import org.example.Exception.RadiusException;
import org.example.Exception.SideException;

public class Rectangle implements Figure{
    private double side;

    public Rectangle(double side) throws SideException{
        try {
            if (side <= 0){
                throw new SideException("Side must be < 0!");
            }
            this.side = side;
        } catch (SideException e){
            System.err.print("Exception: " + e.getMessage());
        }

    }

    @Override
    public double area() {
        double result = side * side;
        return  result;
    }

    @Override
    public String toString() {
        return "Side: " + String.valueOf(this.side) + "\nArea: " + String.valueOf(this.area());
    }
}
