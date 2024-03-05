package com.learning.core.day3;

public class D03P13 {
    public static void main(String[] args) {
        String input = "Mr John Smith";
        String output = replaceSpaces(input);
        System.out.println("Output: " + output);
    }

    public static String replaceSpaces(String input) {
        // Replace spaces with '%20'
        return input.replace(" ", "%20");
    }
}
