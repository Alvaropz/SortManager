package com.spartaglobal.sortManager.view;

import java.util.Arrays;
import java.util.Scanner;

public class SortView {
    public String getDesiredType() {
        System.out.print("Please enter your desired sort (b) for Bubble and (m) for Merge: ");
        Scanner scanner = new Scanner(System.in);
        String desiredSortType = scanner.next().toLowerCase();
        return desiredSortType;
    }

    public void dispplayResults(int[] result) {
        System.out.println(Arrays.toString(result));
    }
}
