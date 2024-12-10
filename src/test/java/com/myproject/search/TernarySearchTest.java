package com.myproject.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Miroslav Kološnjaji
 */
class TernarySearchTest {

    int[] array;

    @BeforeEach
    void setUp() {
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    }

    @DisplayName("Ternary Search")
    @Test
    void testTernarySearch_whenValueExistsInProvidedArray_returnsSameValue() {

        int number = 15;

        int result = TernarySearch.ternarySearch(array, number);

        assertEquals(number, result, "Result doesn't match expected value.");
    }

    @DisplayName("Ternary Search - Value doesn't exists")
    @Test
    void testTernarySearch_whenValueDoesntExistsInProvidedArray_returnsNegativeNumber() {

        array =  new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20};

        int number = 16;

        int result = TernarySearch.ternarySearch(array, number);

        assertEquals(-1, result, "Result doesn't match expected value.");
    }
}