package com.learning.core.day3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D03P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Index of the first repeating element: " + findFirstRepeatingIndex(arr));
    }

    public static int findFirstRepeatingIndex(int[] arr) {
//        Set<Integer> set = new HashSet<>();
//        for(int i =0;i<arr.length; i++){
//            if(set.contains(arr[i])){
//                return i;
//            }
//            set.add(arr[i]);
//        }
        Set<Integer> set = new HashSet<>();
        for(int i =0; i< arr.length ; i++){
            if(set.contains(arr[i])){
                return i;
            }
            set.add(arr[i]);
        }
        return -1;
    }
}
