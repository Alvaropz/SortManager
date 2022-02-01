package com.spartaglobal.sortManager.model;

public class BubbleSort implements Sort {

    // Main logic provided by https://www.geeksforgeeks.org/bubble-sort/
    @Override
    public int[] sort(int[] arr) {
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
        return arr;
    }


}