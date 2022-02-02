package com.spartaglobal.sortManagerTester;

import com.spartaglobal.sortManager.controller.SortController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTester {

    @Test
    @DisplayName("This checks if an array is sorted via the Bubble Sort method")
    public void testMergeSort(){
        int[] inputArray = new int[40];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int)Math.floor((Math.random()*100)+1);
        }
        int[] inputArrayCopy = inputArray.clone();
        Arrays.sort(inputArrayCopy);

        SortController controller = new SortController();
        int[] result = controller.sortArray("m", inputArray);

        String expected = Arrays.toString(result);
        String actual = Arrays.toString(inputArrayCopy);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This checks if a merge sort works with an empty array")
    public void testMergeSortEmptyArray(){
        SortController controller = new SortController();
        int[] result = controller.sortArray("m", new int[0]);

        String expected = Arrays.toString(result);
        String actual = Arrays.toString(new int[0]);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This checks if a merge sort works with having the same in value for all elements in the array")
    public void testMergeSortSameValue(){
        int[] inputArray = new int[]{0, 0, 0, 0, 0};

        int[] inputArrayCopy = inputArray.clone();
        Arrays.sort(inputArrayCopy);

        SortController controller = new SortController();
        int[] result = controller.sortArray("m", inputArray);
        String expected = Arrays.toString(result);
        String actual = Arrays.toString(inputArrayCopy);
        Assertions.assertEquals(expected, actual);
    }

}
