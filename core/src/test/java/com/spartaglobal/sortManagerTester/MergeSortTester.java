package com.spartaglobal.sortManagerTester;

import com.spartaglobal.sortManager.BubbleSort;
import com.spartaglobal.sortManager.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTester {

    @Test
    @DisplayName("This checks if an array is sorted via the Bubble Sort method")
    public void testMergeSort(){
        int[] inputArray = new int[40];
        int testArrayLength = inputArray.length;

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int)Math.floor(Math.random()*(100)+1);
        }

        int[] inputArrayCopy = inputArray.clone();
        Arrays.sort(inputArrayCopy);

        MergeSort mergeSort = new MergeSort(inputArray, testArrayLength);
        String expected = Arrays.toString(mergeSort.sortArray());
        String actual = Arrays.toString(inputArrayCopy);
        Assertions.assertEquals(expected, actual);
    }

}
