package com.amruth.java;

import java.math.BigDecimal;

public class CurrencyValue {

    public  static void main(String[] args){

        double val = .012;
        double psum = val + val + val;
        System.out.println("Psum = " + psum); //error in floating precision

        //BigDecimal can be used to handle precision
        String strValue = Double.toString(val);
        System.out.println("String value = " + strValue);

        BigDecimal preciseVal = new BigDecimal(strValue);
        BigDecimal bSum = preciseVal.add(preciseVal.add(preciseVal));

        //Can be used while dealing with currency
        System.out.println("BigDecimal sum value = " + bSum.toString());

    }

}
