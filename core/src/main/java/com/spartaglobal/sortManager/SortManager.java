package com.spartaglobal.sortManager;

import com.spartaglobal.sortManager.controller.SortController;
import com.spartaglobal.sortManager.view.SortView;

import java.util.Arrays;

public class SortManager {
    public static void main(String[] args) {
//        SortView view = new SortView();
//        String desiredType = view.getDesiredType();
//        SortController controller = new SortController();
//        int[] result = controller.sortArray(desiredType);
//        view.displayResults(result);
//
//        desiredType = view.getDesiredType();
//        controller = new SortController();
//        result = controller.sortArray(desiredType);
//        view.displayResults(result);
//
//        controller = new SortController();
//        result = controller.sortArray(null);
//        view.displayResults(result);

        SortController controller = new SortController();
        int[] result = controller.sortArray("t");
        System.out.println(Arrays.toString(result));
    }
}
