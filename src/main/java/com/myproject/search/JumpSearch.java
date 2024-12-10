package com.myproject.search;

/**
 * @author Miroslav Kološnjaji
 */
public class JumpSearch {

    /**
     * Jump Search divides the array into blocks and searches these blocks by jumping ahead, then performs a linear search within the block where the target element is found.
     * It is more efficient than Linear Search but not as efficient as Binary Search. The array must be sorted.
     *
     * @param array (must be sorted)
     * @param value (no restrictions)
     * @return value or -1
     */

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
                        return array[i];
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
