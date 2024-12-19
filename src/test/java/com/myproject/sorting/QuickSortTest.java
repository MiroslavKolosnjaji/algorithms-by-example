package com.myproject.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Miroslav Kološnjaji
 */
class QuickSortTest {

    private final int[] array = {15, 6, 3, 1, 22, 10, 13};

    @Test
    void testQuickSort_whenValidArrayProvided_returnsSortedArray() {

        int[] expectedArray = {1, 3, 6, 10, 13, 15, 22};

        int[] result = QuickSort.quickSort(array);
        System.out.println(Arrays.toString(result));

        assertArrayEquals(expectedArray, result, "Result doesn't match expected array.");

    }
}