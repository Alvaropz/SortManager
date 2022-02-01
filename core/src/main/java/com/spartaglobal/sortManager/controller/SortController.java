package com.spartaglobal.sortManager.controller;

import com.spartaglobal.sortManager.model.*;

public class SortController {
    public int[] sortArray(String desiredSortType) {
        Sort s = getSort(desiredSortType);

        int[] arr = new int[40];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.floor((Math.random()*100)+1);
        }

        return s.sort(arr);
    }

    public int[] sortArray(String desiredSortType, int[] arr) {
        Sort s = getSort(desiredSortType);
        return s.sort(arr);
    }

    public static Sort getSort(String sortType) {
        SortFactory sf;
        if ("b".equals(sortType)) {
            sf = new BubbleFactory();
        } else if ("m".equals(sortType)) {
            sf = new MergeFactory();
        } else {
            sf = null;
        }

        return sf.getInstance();
    }

}
