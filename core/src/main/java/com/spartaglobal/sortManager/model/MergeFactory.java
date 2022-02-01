package com.spartaglobal.sortManager.model;

public class MergeFactory extends SortFactory {

    @Override
    public Sort getInstance() {
        return new MergeSort();
    }
}
