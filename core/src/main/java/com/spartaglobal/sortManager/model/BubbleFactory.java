package com.spartaglobal.sortManager.model;

public class BubbleFactory extends SortFactory {

    @Override
    public Sort getInstance() {
        return new BubbleSort();
    }
}
