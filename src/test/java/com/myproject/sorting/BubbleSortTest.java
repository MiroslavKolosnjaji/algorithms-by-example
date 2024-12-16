package com.myproject.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Miroslav Kološnjaji
 */
class BubbleSortTest {

    private final int[] array = {1, 7, 8, 4, 9, 2, 5, 12};


    @DisplayName("Bubble Sort")
    @Test
    void testBubbleSort_whenValidArrayProvided_returnsSortedArray() {

        int[] expectedArray = {1, 2, 4, 5, 7, 8, 9, 12};

        int[] result = BubbleSort.bubbleSort(array);

        assertArrayEquals(expectedArray, result, "Result doesn't match expected array.");
    }
}