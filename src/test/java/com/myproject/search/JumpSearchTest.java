package com.myproject.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Miroslav Kološnjaji
 */
class JumpSearchTest {

    int[] array;

    @BeforeEach
    void setUp() {
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    }

    @DisplayName("Jump Search")
    @Test
    void testJumpSearch_whenValueExistsInProvidedArray_returnsSameValue() {

        int number = 17;

        int result = JumpSearch.jumpSearch(array, number);

        assertEquals(number, result, "Result doesn't match expected value.");
    }
}