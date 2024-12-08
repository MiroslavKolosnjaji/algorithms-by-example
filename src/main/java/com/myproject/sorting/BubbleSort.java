package com.myproject.sorting;

/**
 * @author Miroslav Kološnjaji
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    var temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
