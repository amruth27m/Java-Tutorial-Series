package com.amruth.java;

public class ConvertValues {
    public static void main(String[] args){
        int intValue = 1295;
        byte byteVal = (byte) intValue;
        //Narrowing type may cause data loss
        System.out.println("Byte value  is " + byteVal);

        double doubleValue = 4.9999d;
        int doubleInt = (int) doubleValue;
        System.out.println("Int value is " + doubleInt);

    }
}
