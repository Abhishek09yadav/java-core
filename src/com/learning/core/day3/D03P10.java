package com.learning.core.day3;


import java.util.Arrays;
public class D03P10 {
    public static int longestPrefixSuffix(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int j = 0, i = 1;
        while (i < n) {
            if (str.charAt(i) == str.charAt(j)) {
                lps[i] = j + 1;
                j++;
                i++;
            } else {
                if (j == 0) {
                    i++;
                } else {
                    j = lps[j - 1];
                }
            }
        }
        return lps[n - 1];
    }

    public static void main(String[] args) {
        String s = "abadabab";
        System.out.println(longestPrefixSuffix(s)); // Output: 2
    }
}
