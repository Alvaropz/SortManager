package com.spartaglobal.sortManager.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MergeFactory extends SortFactory {

    private static Logger logger = LogManager.getLogger("Merge Factory");
    @Override
    public Sort getInstance() {
        logger.info("Merge Sort - getInstance");
        return new MergeSort();
    }
}
