package com.amruth.java;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int val1 = 15;
        int val2 = 15;
        int result = val1 + val2;
        System.out.printf("Sum is %d%n", val1 + val2);

        double round = -3.7;
        System.out.printf("Rounded value is %d%n", Math.round(round));

        double absValue = -12.4d;
        System.out.printf("Absolute value is %s%n", Math.abs(absValue));
    }
}
