package com.amruth.java;

public class PrimitiveInteger {

    public static void main(String []args){
        byte b = 127;
        System.out.println("Byte value: " + b);

        if(b<Byte.MAX_VALUE) {
            b++;
            System.out.println("Incremental byte value: " + b);
        }

        else {
            System.out.println("Byte value limit reached ");
        }
    }
}
