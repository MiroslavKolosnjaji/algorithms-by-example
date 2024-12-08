package com.myproject.search;

/**
 * @author Miroslav Kološnjaji
 */
public class JumpSearch {

    public static int jumpSearch(int[] array, int value) {
        int start = 0;
        int next = array.length / 3;

        int counter = 1;
        while (start < array.length) {

            if(next > array.length)
                next = array.length;

            if (value <= array[next - 1]) {
                for (int i = start; i < next; i++) {
                    if (array[i] == value)
                        return i;
                }
                break;
            }


            if (value > array[next - 1]) {
                start = next;
                next = array.length / 3;
                next *= ++counter;
            }
        }

        return -1;

    }
}
