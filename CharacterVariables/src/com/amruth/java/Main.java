package com.amruth.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char a = 'b';
        char b = '1';
        System.out.println("Chars " + a +b);
        char c = '$';
        System.out.println(Character.toUpperCase(a));

        String s = "Hello Idea!";
        if(s instanceof java.lang.String) {
            System.out.println("s is a string");
        }

        String s2 = "Hello Idea!";
        if(s == s2){
            System.out.println("Normal equality works");
        }
        else{
            if(s.equals(s2)){
                System.out.println("strings match using equals method");
            }
        }

    }
}
