package com.spartaglobal.sortManager.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;


public class BubbleSort implements Sort {

    private static Logger logger = LogManager.getLogger("Bubble Sort Method");

    // Main logic provided by https://www.geeksforgeeks.org/bubble-sort/
    @Override
    public int[] sort(int[] arr) {

        long start = System.nanoTime();

        int i;
        int j;
        int temp;
        for (i = 0; i < arr.length-1; i++){
            for (j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        long end = System.nanoTime();
        logger.info("It took a total of " + (TimeUnit.MICROSECONDS.convert(end-start, TimeUnit.NANOSECONDS)) + " milliseconds to run the merge sort method");
        return arr;
    }


}