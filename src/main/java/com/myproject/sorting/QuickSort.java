package com.myproject.sorting;

/**
 * @author Miroslav Kološnjaji
 */
public class QuickSort {

    public static int[] quickSort(int[] array) {
        return quickSort(array, array[array.length - 1]);
    }

    private static int[] quickSort(int[] array, int pivot) {

        int boundary = -1;
        for (int i = 0; i < array.length; i++) {
            if (pivot >= array[i]) {
                var temp = array[++boundary];
                array[boundary] = array[i];
                array[i] = temp;
            }
        }

        if (boundary - 1 < 0)
            return array;

        return quickSort(array, array[boundary - 1]);
    }
}
