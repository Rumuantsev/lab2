package org.example.geometry2d;

public class Rectangle implements Figure{
    private double side;

    public Rectangle(double side){
        this.side = side;
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
