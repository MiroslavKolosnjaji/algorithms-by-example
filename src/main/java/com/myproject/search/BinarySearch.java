package com.myproject.search;

/**
 * @author Miroslav Kološnjaji
 */
public class BinarySearch {

    /**
     * Binary Search is an efficient algorithm used to find a target element in a sorted array.
     * The algorithm divides the array into two halves, compares the middle element with the target, and then decides which half to search next.
     * The time complexity is O(log n). The array must be sorted.
     *
     * @param array (must be sorted)
     * @param value (no restrictions)
     * @return value or -1
     */


    public static int binarySearchRec(int[] array, int value) {
        return binarySearchRec(array, value, 0, array.length - 1);
    }

    public static int binarySearchRec(int[] array, int number, int left, int right) {

        if (right < left)
            return -1;

        int middle = (left + right) / 2;

        if (array[middle] == number)
            return array[middle];

        if (number > array[middle]) {
            return binarySearchRec(array, number, middle + 1, right);
        } else if (number < array[middle]) {
            return binarySearchRec(array, number, left, middle - 1);
        }

        return -1;
    }

    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        int middle = (left + right) / 2;

        while (true) {

            if (array[middle] == value)
                return array[middle];

            if (value < array[middle])
                right = middle - 1;
            else
                left = middle + 1;

            middle = (left + right) / 2;

            if (right < left)
                break;
        }
        return -1;
    }
}
