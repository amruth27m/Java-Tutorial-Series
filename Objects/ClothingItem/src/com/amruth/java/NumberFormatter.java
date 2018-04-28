package com.amruth.java;

import java.text.NumberFormat;

public class NumberFormatter {
    public static void main(String[] args){
        long longValue = 10_000_00;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);
    }
}
