package com.myproject.sorting;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Miroslav Kološnjaji
 */
public class BucketSort {

    public static int[] bucketSort(int[] array){
        LinkedList<Integer>[] list = new LinkedList[array.length];
        for (int i = 0; i < array.length; i++) {
            var index = array[i] / list.length;

            if(list[index] == null)
                list[index] = new LinkedList<>();

            list[index].add(array[i]);
        }

        for (int i = 0; i < list.length; i++) {

            if(list[i] == null) continue;

            Collections.sort(list[i]);
        }

        var index = 0;
        for (int i = 0; i < array.length; i++) {

            if(list[index].isEmpty())
                index++;

            array[i] = list[index].removeFirst();
        }
        return array;
    }
}
