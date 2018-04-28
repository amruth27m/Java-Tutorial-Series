package com.amruth.java;

public class ClothingItem {
    /* Instance variable */
    public String type;

    public static void main(String[] args) {
        ClothingItem item = new ClothingItem(); /* instantiation */
        item.type = "Hat";
        item.displayItem();
    }

    public void displayItem(){                          /* Instance method */
        System.out.println("This is a " + this.type);
    }
}
