package com.myproject.search;

/**
 * @author Miroslav Kološnjaji
 */
public class TernarySearch {

    /**
     * Ternary Search is similar to Binary Search but divides the array into three parts instead of two.
     * Although it can be faster in certain situations, its time complexity is O(log₃ n), which is slightly less efficient than Binary Search.
     * The array must be sorted.
     *
     * @param array (must be sorted)
     * @param value (no restrictions)
     * @return value or -1
     */

    public static int ternarySearch(int[] array, int value) {
        return ternarySearch(array, value, 0, array.length - 1);
    }

    private static int ternarySearch(int[] array, int value, int left, int right) {

        if (right < left)
            return -1;

        int partititonSize = (right - left) / 3;

        int mid1 = left + partititonSize;
        int mid2 = right - partititonSize;

        if (array[mid1] == value)
            return array[mid1];
        else if (array[mid2] == value)
            return array[mid2];

        if (value > array[mid2])
            return ternarySearch(array, value, mid2 + 1, array.length - 1);
        else if (value < array[mid1])
            return ternarySearch(array, value, 0, mid1 - 1);


        return ternarySearch(array, value, mid1 + 1, mid2 - 1);
    }
}
