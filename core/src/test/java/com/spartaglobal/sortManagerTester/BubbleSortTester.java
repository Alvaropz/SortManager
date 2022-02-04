package com.spartaglobal.sortManagerTester;

import com.spartaglobal.sortManager.controller.SortManager;
import org.junit.jupiter.api.*;

import java.util.Arrays;

public class BubbleSortTester {

    private SortManager controller;
    @BeforeEach
    public void setUp() {
        controller = new SortManager();
    }

    public int[] copyArray(int[] originalArray) {
        int[] inputArrayCopy = originalArray.clone();
        Arrays.sort(inputArrayCopy);
        return inputArrayCopy;
    }

    @Test
    @DisplayName("This checks if an array is sorted via the Bubble Sort method")
    public void testBubbleSort(){
        int[] inputArray = new int[40];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int)Math.floor((Math.random()*100)+1);
        }
        int[] inputArrayCopy = copyArray(inputArray);

        int[] result = controller.sortArray("b", inputArray);
        String expected = Arrays.toString(result);
        String actual = Arrays.toString(inputArrayCopy);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("This checks if a bubble sort works with an empty array")
    public void testBubbleSortEmptyArray(){
        int[] inputArray = new int[]{};
        int[] inputArrayCopy = copyArray(inputArray);

        int[] result = controller.sortArray("b", inputArray);
        String expected = Arrays.toString(result);
        String actual = Arrays.toString(inputArrayCopy);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("This checks if a bubble sort works with having the same in value for all elements in the array")
    public void tesBubbleSortSameValue(){
        int[] inputArray = new int[]{0, 0, 0, 0, 0};
        int[] inputArrayCopy = copyArray(inputArray);

        int[] result = controller.sortArray("b", inputArray);
        String expected = Arrays.toString(result);
        String actual = Arrays.toString(inputArrayCopy);
        Assertions.assertEquals(expected, actual);
    }


}