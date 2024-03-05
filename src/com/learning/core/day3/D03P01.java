package com.learning.core.day3;

import java.util.Scanner;

public class D03P01 {
    public static boolean ispalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        boolean res = ispalindrome(str);

        System.out.println("Length of the string: " + str.length());
        String uppercaseString = str.toUpperCase();
        System.out.println("String in uppercase: " + uppercaseString);

        if(res){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");

        }
    }
}
