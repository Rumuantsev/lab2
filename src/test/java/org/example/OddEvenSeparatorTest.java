package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenSeparatorTest {

    @Test
    void even() {
        Integer[] testArray = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(testArray));
        OddEvenSeparator numbers = new OddEvenSeparator(testList);
        Integer[] expectedArray = {2, 4, 6};
        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(expectedArray));
        assertEquals(expectedList, numbers.even());
    }

    @Test
    void odd() {
        Integer[] testArray = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(testArray));
        OddEvenSeparator numbers = new OddEvenSeparator(testList);
        Integer[] expectedArray = {1, 3, 5};
        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(expectedArray));
        assertEquals(expectedList, numbers.odd());
    }
}