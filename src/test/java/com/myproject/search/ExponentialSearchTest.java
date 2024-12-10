package com.myproject.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Miroslav Kološnjaji
 */
class ExponentialSearchTest {

    @DisplayName("Exponential Search")
    @Test
    void testExponentialSearch_whenValueExistsInProvidedArray_returnsSameValue() {

        int[] array = getLongArray(false);
        int number = 563;

        int result = ExponentialSearch.exponentialSearch(array, number);

        assertEquals(number, result, "Result doesn't match expected value.");
    }

    @DisplayName("Exponential Search - Value Not Found")
    @Test
    void testExponentialSearch_whenValueDoesntExistsInProvidedArray_returnsNegativeValue() {

        int[] array = getLongArray(true);
        int number = 563;

        int result = ExponentialSearch.exponentialSearch(array, number);

        assertEquals(-1, result, "Result doesn't match expected value.");
    }

    private int[] getLongArray(boolean hide563) {

        int[] array = new int[1001];

        for (int i = 0; i <= 1000; i++) {

            if (i == 563 && hide563) continue;

            array[i] = i;
        }

        return array;
    }
}