package com.learning.core.day3;

import java.util.*;

public class D03P11 {
    public static List<String> findMatchedWords(String[] dict, String pattern) {
        List<String> result = new ArrayList<>();
        String hashPattern = encodeString(pattern);

        for (String word : dict) {
            if (word.length() == pattern.length() && encodeString(word).equals(hashPattern)) {
                result.add(word);
            }
        }
        return result;
    }

    // Define the encodeString method
    public static String encodeString(String input) {
        // Your implementation logic here
        // For demonstration purposes, let's assume it returns the input string as is
        return input;
    }

    public static void main(String[] args) {
        String[] dict = {"abb", "abc", "xyz", "xyy"};
        String pattern = "foo";
        List<String> matchedWords = findMatchedWords(dict, pattern);

        System.out.println("Words matching the pattern:");
        for (String word : matchedWords) {
            System.out.print(word + " ");
        }
    }
}
