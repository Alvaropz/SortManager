package com.spartaglobal.sortManager.controller;

import com.spartaglobal.sortManager.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortController {
    private static Logger logger = LogManager.getLogger("Controller Logger");

    public int[] sortArray(String desiredSortType) {
        logger.info("Desired sorted method input call");

        Sort s = getSort(desiredSortType);

        int[] arr = new int[40];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.floor((Math.random()*100)+1);
        }
        logger.info("Random integers' array created successfully");

        return s.sort(arr);
    }

    public int[] sortArray(String desiredSortType, int[] arr) {
        logger.info("Call Sort Array Function");

        Sort s = getSort(desiredSortType);
        return s.sort(arr);
    }

    public static Sort getSort(String sortType) {
        logger.info("Call getSort Reference");

        SortFactory sf;
        if ("b".equals(sortType)) {
            sf = new BubbleFactory();
        } else if ("m".equals(sortType)) {
            sf = new MergeFactory();
        } else if ("t".equals(sortType)) {
            sf = new BSTFactory();
        } else {
            logger.error("Invalid input - SortFactory Object will be null");
            sf = null;
            System.exit(1);
        }

        return sf.getInstance();
    }

}
