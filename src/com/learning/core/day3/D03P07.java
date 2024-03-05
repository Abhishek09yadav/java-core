package com.learning.core.day3;

import java.util.Scanner;

public class D03P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        printSubsequences(str, "");
    }
    public static void printSubsequences(String str, String current) {
        if (str.isEmpty()) {
            System.out.print(current + ", ");
            return;
        }
        printSubsequences(str.substring(1), current + str.charAt(0));
        printSubsequences(str.substring(1), current);
    }
}
