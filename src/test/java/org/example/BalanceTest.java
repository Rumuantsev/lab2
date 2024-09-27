package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    @Test
    void result() {
        Balance testBalance1 = new Balance(3, 3);
        assertEquals( "=", testBalance1.result());
        Balance testBalance2 = new Balance(4, 3);
        assertEquals( "L", testBalance2.result());
        Balance testBalance3 = new Balance(3, 4);
        assertEquals( "R", testBalance3.result());
    }
}