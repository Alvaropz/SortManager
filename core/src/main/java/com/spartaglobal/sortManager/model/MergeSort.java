package com.spartaglobal.sortManager.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.TimeUnit;

public class MergeSort implements Sort{

    private static Logger logger = LogManager.getLogger("Merge Sort Method");

    @Override
    public int[] sort(int[] arr) {
        try {
            long start = System.nanoTime();

            if (arr.length < 2) {
                return arr;
            }
            int mid = arr.length / 2;
            int[] l = new int[mid];
            int[] r = new int[arr.length - mid];

            for (int i = 0; i < mid; i++) {
                l[i] = arr[i];
            }
            for (int i = mid; i < arr.length; i++) {
                r[i - mid] = arr[i];
            }
            sort(l, mid);
            sort(r, arr.length - mid);

            merge(arr, l, r, mid, arr.length - mid);
            long end = System.nanoTime();
            logger.info("It took a total of " + (TimeUnit.MICROSECONDS.convert(end-start, TimeUnit.NANOSECONDS)) + " milliseconds to run the merge sort method");
            return arr;
        } catch (OutOfMemoryError e) {
            logger.error(e);
            return new int[0];
        }
    }

    public int[] sort(int[] arr, int n) {
        if (n < 2) {
            return arr;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        sort(l, mid);
        sort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
        return arr;
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
