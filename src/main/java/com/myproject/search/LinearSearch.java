package com.myproject.search;

/**
 * @author Miroslav Kološnjaji
 */
public class LinearSearch {

    /**
     *  Linear Search simply goes through each element in the array one by one until it finds the target element.
     *  Although easy to implement, it has a time complexity of O(n), making it less efficient for large arrays.
     *  The array does not need to be sorted.
     *
     *
     * @param array (does not need to be sorted)
     * @param value (no restrictions)
     * @return value or -1
     */

    public static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++)
            if (array[i] == value) return array[i];

        return -1;
    }
}
