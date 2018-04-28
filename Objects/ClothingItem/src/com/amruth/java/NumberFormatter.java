package com.amruth.java;

import java.text.NumberFormat;
import java.util.Scanner;

public class NumberFormatter {
    public static void main(String[] args){
        long longValue = 10_000_00;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);

        String s1 = "Hello ";
        String s2 = "World ";
        String s3 = "Idea ";
        StringBuilder sb = new StringBuilder(s1).append(s2).append(s3);
        System.out.println(sb);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Input is " + input);
    }
}
