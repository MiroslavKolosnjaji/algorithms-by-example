package com.myproject.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Miroslav Kološnjaji
 */
class InsertionSortTest {

    private final int[] array = {1, 7, 8, 4, 9, 2, 5, 12,86,35,13,6};


    @DisplayName("Insertion Sort")
    @Test
    void testInsertionSort_whenValidArrayProvided_returnsSortedArray() {

        int[] expectedArray = {1, 2, 4, 5, 6, 7, 8, 9, 12, 13, 35, 86};

        int[] result = InsertionSort.insertionSort(array);

        assertArrayEquals(expectedArray, result, "Result doesn't match expected array.");

    }
}