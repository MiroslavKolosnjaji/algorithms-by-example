package com.myproject.search;

import static com.myproject.search.BinarySearch.binarySearchRec;

/**
 * @author Miroslav Kološnjaji
 */
public class ExponentialSearch {

    /**
     * Exponential Search uses a method similar to Binary Search, but first tries to find a range in which the target element might be located by exponentially increasing the range size.
     * Once the appropriate range is found, Binary Search is applied within that range. This algorithm is useful when the size of the array is unknown.
     * The array must be sorted.
     *
     * @param array (must be sorted)
     * @param value (no restrictions)
     * @return value or -1
     */


    public static int exponentialSearch(int[] array, int value){
        int bound = 1;
        while(bound < array.length && array[bound] < value)
            bound *= 2;
        return binarySearchRec(array, value, bound / 2, Math.min(bound, array.length - 1));
    }
}
