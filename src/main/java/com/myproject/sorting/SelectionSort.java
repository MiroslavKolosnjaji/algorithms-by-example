package com.myproject.sorting;

/**
 * @author Miroslav Kološnjaji
 */
public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        int value;
        int index;
        for (int i = 0; i < array.length; i++) {
            value = array[i];
            index = -1;
            for (int j = i; j < array.length; j++) {
                if (value > array[j]) {
                    value = array[j];
                    index = j;
                }
            }

            if (index != -1) {
                var temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
        return array;
    }
}
