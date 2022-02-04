package com.spartaglobal.sortManager.view;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {
    private static Logger logger = LogManager.getLogger("Viewer Logger");

    public String getDesiredType() {
        logger.info("Desired sorted method input call");
        Scanner scanner = new Scanner(System.in);
        String desiredSortType = "";

        while (!Arrays.asList(new String[]{"b", "m", "t"}).contains(desiredSortType)) {
            System.out.print("Please enter your desired sort (b) for Bubble, (m) for Merge and (t) for Binary Search Tree. Type 'exit' to stop the program: ");
            desiredSortType = scanner.next().toLowerCase();
            if (desiredSortType.equals("exit")) {
                System.exit(0);
            }
        }
        return desiredSortType;
    }

    public void displayResults(int[] result) {
        logger.info("Display Results");
        System.out.print("Result: ");
        System.out.println(Arrays.toString(result));
    }
}
