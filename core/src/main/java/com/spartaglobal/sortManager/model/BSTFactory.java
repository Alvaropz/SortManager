package com.spartaglobal.sortManager.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BSTFactory extends SortFactory{
    private static Logger logger = LogManager.getLogger("BST Factory");
    @Override
    public Sort getInstance() {
        logger.info("BST Sort - getInstance");
        return new BSTSort();
    }
}
