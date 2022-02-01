package com.spartaglobal.sortManager;

public class BubbleSort extends Sort{
    public BubbleSort(int[] arrayInts, int arrayIntsLength) {
        super(arrayInts, arrayIntsLength);
    }

    // Main logic provided by https://www.geeksforgeeks.org/bubble-sort/
    @Override
    public int[] sortArray() {
        int i;
        int j;
        int temp;
        for (i = 0; i < arrayIntsLength-1; i++){
            for (j = 0; j < arrayIntsLength-i-1; j++) {
                if (arrayInts[j] > arrayInts[j+1]) {
                    temp = arrayInts[j];
                    arrayInts[j] = arrayInts[j+1];
                    arrayInts[j+1] = temp;
                }
            }
        }
        return arrayInts;
    }
}

