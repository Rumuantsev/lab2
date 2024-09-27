package org.example.geometry3d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void volume() {
        Cylinder cylinder = new Cylinder(2, 4);
        assertEquals(50.26548245743669, cylinder.volume());
    }
}