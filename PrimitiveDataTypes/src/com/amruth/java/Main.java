package com.amruth.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double doubleValue = 10.4d;
        Double doubleObject = new Double(doubleValue);  //Double helper class object

        byte byteValue = doubleObject.byteValue();
        System.out.println(byteValue);

        int intValue = doubleObject.intValue();
        System.out.println(intValue);

        int intValue2 = 1100;
        Integer intObject = new Integer(intValue2);
        String integer_str = intObject.toString();
        System.out.println(integer_str);
    }
}
