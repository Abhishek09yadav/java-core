package com.learning.core.day3;
import java.util.Scanner;
public class D03P08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        int minDeletions = minDeletionsToMakePalindrome(str);
        System.out.println("Minimum number of deletions to make the string a palindrome: " + minDeletions);
    }

    private static int minDeletionsToMakePalindrome(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        // Initialize the diagonal elements to 1 (single character strings are palindromes)
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Build the dp table bottom-up
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }

        // The length of the LPS is stored in dp[0][n-1]
        int lps = dp[0][n - 1];
        return n - lps;
    }
}