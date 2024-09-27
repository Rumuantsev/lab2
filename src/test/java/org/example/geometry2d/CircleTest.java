package org.example.geometry2d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void area() {
        Circle circle = new Circle(2);
        assertEquals(12.566370614359172, circle.area());
    }
}