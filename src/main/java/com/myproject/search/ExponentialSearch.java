package com.myproject.search;

import static com.myproject.search.BinarySearch.binarySearchRec;

/**
 * @author Miroslav Kološnjaji
 */
public class ExponentialSearch {

    public static int exponentialSearch(int[] array, int value){
        int bound = 1;
        while(bound < array.length && array[bound] < value)
            bound *= 2;
        return binarySearchRec(array, value, bound / 2, Math.min(bound, array.length - 1));
    }
}
