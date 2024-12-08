package com.myproject.sorting;

/**
 * @author Miroslav Kološnjaji
 */
public class CountingSort {

    public static int[] countingSort(int[] array) {
        int[] subArray = new int[findMax(array) + 1];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter = 0;

            if (subArray[array[i]] == 0) {
                subArray[array[i]] = ++counter;
                continue;
            }

            counter = subArray[array[i]];
            subArray[array[i]] = ++counter;
        }
        int index = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = index; j < subArray.length; j++) {
                if(subArray[j] == 0) continue;

                array[i] = j;
                counter = subArray[j];
                subArray[j] = --counter;
                index = j;
                break;
            }
        }
        return array;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];

        }
        return max;
    }

}
