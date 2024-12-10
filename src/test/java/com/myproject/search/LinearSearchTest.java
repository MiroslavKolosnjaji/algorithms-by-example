package com.myproject.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Miroslav Kološnjaji
 */
class LinearSearchTest {

    int[] array;

    @BeforeEach
    void setUp() {
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    }

    @DisplayName("Linear Search")
    @Test
    void testLinearSearch_whenValueExistsInProvidedArray_returnsSameValue() {

        int number = 13;

        int result = LinearSearch.linearSearch(array, number);

        assertEquals(number, result, "Result doesn't match expected value.");
    }

    @DisplayName("Linear Search - Value doesn't exist.")
    @Test
    void testLinearSearch_whenValueDoesntExistsInProvidedArray_returnsNegativeNumber() {

        int number = 22;

        int result = LinearSearch.linearSearch(array, number);

        assertEquals(-1, result, "Result doesn't match expected value.");
    }
}