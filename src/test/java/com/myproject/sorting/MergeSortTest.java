package com.myproject.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Miroslav Kološnjaji
 */
class MergeSortTest {

    private final int[] array = {8, 2, 4, 1, 3};


    @Test
    void testMergeSort_whenValidArrayProvided_returnsSortedArray() {

        int[] expectedArray = {1, 2, 3, 4, 8};

        int[] result = MergeSort.mergerSort(array);

        assertArrayEquals(expectedArray, result, "Result doesn't match expected array.");
    }
}