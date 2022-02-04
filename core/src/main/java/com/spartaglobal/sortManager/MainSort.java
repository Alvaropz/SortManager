package com.spartaglobal.sortManager;

import com.spartaglobal.sortManager.controller.SortManager;
import com.spartaglobal.sortManager.view.DisplayManager;

public class MainSort {
    public static void main(String[] args) {
        DisplayManager view = new DisplayManager();
        String desiredType = view.getDesiredType();
        SortManager controller = new SortManager();
        int[] result = controller.sortArray(desiredType);
        view.displayResults(result);

        desiredType = view.getDesiredType();
        controller = new SortManager();
        result = controller.sortArray(desiredType);
        view.displayResults(result);

        desiredType = view.getDesiredType();
        controller = new SortManager();
        result = controller.sortArray(desiredType);
        view.displayResults(result);

        controller = new SortManager();
        result = controller.sortArray(null);
        view.displayResults(result);
    }
}
