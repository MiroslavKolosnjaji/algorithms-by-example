package com.myproject.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Miroslav Kološnjaji
 */
class BinarySearchTest {

    int[] array;

    @BeforeEach
    void setUp() {
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    @DisplayName("Binary Search")
    @Test
    void testBinarySearch_whenValueExistsInProvidedArray_returnsSameValue() {

        int number = 2;

        int result = BinarySearch.binarySearch(array,number);

        assertEquals(number, result, "Result doesn't match expected value.");
    }

    @DisplayName("Binary Search - Value Doesn't Exists")
    @Test
    void testBinarySearch_whenValueDoesntExistsInProvideArray_returnsNegativeNumber() {

        array = new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10};
        int number = 6;

        int result = BinarySearch.binarySearch(array,number);

        assertEquals(-1, result, "Result doesn't match expected value.");
    }

    @DisplayName("Binary Search - Recursive -")
    @Test
    void testBinarySearchRecursive_whenValueExistsInProvidedArray_returnsSameValue() {

        int number = 2;

        int result = BinarySearch.binarySearchRec(array,number);

        assertEquals(number, result, "Result doesn't match expected value.");
    }

    @DisplayName("Binary Search - Recursive - Value Doesn't Exists")
    @Test
    void testBinarySearchRecursive_whenValueDoesntExistsInProvidedArray_returnsNegativeNumber() {

        array = new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10};
        int number = 6;

        int result = BinarySearch.binarySearchRec(array,number);

        assertEquals(-1, result, "Result doesn't match expected value.");
    }

}