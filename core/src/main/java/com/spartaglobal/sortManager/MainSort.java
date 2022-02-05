package com.spartaglobal.sortManager;

import com.spartaglobal.sortManager.controller.SortManager;
import com.spartaglobal.sortManager.view.DisplayManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainSort {

    private static Logger logger = LogManager.getLogger("MainSort");
    public static void main(String[] args) {
        logger.info("Main method called");
        DisplayManager view = new DisplayManager();
        String desiredType = view.getDesiredType();
        int length = view.getArrayLength();
        SortManager controller = new SortManager();
        int[] result = controller.sortArray(desiredType, length);
        view.displayResults(result);

        desiredType = view.getDesiredType();
        controller = new SortManager();
        length = view.getArrayLength();
        result = controller.sortArray(desiredType, length);
        view.displayResults(result);

        desiredType = view.getDesiredType();
        controller = new SortManager();
        length = view.getArrayLength();
        result = controller.sortArray(desiredType, length);
        view.displayResults(result);
    }
}
