package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanaceTest {

    @Test
    void result() {
        Balanace testBalanace1 = new Balanace(3, 3);
        assertEquals( "=", testBalanace1.result());
        Balanace testBalanace2 = new Balanace(4, 3);
        assertEquals( "L", testBalanace2.result());
        Balanace testBalanace3 = new Balanace(3, 4);
        assertEquals( "R", testBalanace3.result());
    }
}