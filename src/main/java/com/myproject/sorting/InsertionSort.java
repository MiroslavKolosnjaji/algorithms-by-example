package com.myproject.sorting;

/**
 * @author Miroslav Kološnjaji
 */
public class InsertionSort {

    public static int[] insertionSort(int[] array) {
        int current;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            current = array[i];

            for (int j = i; j >= 0; j--) {
                if (array[j] > current) {
                    array[j + 1] = array[j];
                    index = j;
                }
            }
            array[index] = current;
        }
        return array;
    }
}
