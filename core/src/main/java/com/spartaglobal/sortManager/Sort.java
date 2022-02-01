package com.spartaglobal.sortManager;

public abstract class Sort {
    protected int[] arrayInts;
    protected int arrayIntsLength;

    public Sort(int[] arrayInts, int arrayIntsLength){
        this.arrayInts = arrayInts;
        this.arrayIntsLength = arrayIntsLength;
    }

    public abstract int[] sortArray();
}

