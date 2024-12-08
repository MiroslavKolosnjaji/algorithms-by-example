package com.myproject.sorting;

import java.util.Arrays;

/**
 * @author Miroslav Kološnjaji
 */
public class MergeSort {

    public static int[] mergerSort(int[] array) {

        if (array.length == 1)
            return array;

        int[] first = mergerSort(Arrays.copyOfRange(array, 0, array.length / 2));
        int[] second = mergerSort(Arrays.copyOfRange(array, array.length / 2, array.length));

        int index = 0;
        int counter = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = counter; j < second.length; j++) {
                if (!(first[i] > second[j])) break;
                array[index++] = second[j];
                counter += 1;
            }
            array[index++] = first[i];
        }
        return array;
    }
}
