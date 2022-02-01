package com.spartaglobal.sortManager;

import com.spartaglobal.sortManager.controller.SortController;
import com.spartaglobal.sortManager.view.SortView;

public class SortManager {
    public static void main(String[] args) {
        SortView view = new SortView();
        String desiredType = view.getDesiredType();

        SortController controller = new SortController();
        int[] result = controller.sortArray(desiredType);

        view.dispplayResults(result);
    }
}
