package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void testToString() {
        Table testTable = new Table(2, 2);
        testTable.setValue(0,0,1);
        testTable.setValue(0,1,2);
        testTable.setValue(1,0,3);
        testTable.setValue(1,1,4);
        assertEquals("1 2 3 4 ", testTable.toString());
    }

    @Test
    void average() {
        Table testTable = new Table(2, 2);
        testTable.setValue(0,0,1);
        testTable.setValue(0,1,2);
        testTable.setValue(1,0,3);
        testTable.setValue(1,1,4);
        assertEquals(2.5, testTable.average());
    }
}