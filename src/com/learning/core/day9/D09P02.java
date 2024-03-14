package com.learning.core.day9;

import java.util.*;

public class D09P02 {
    public static void main(String[] args) {
        int[] array = {90, -4, 8, 2, 6, -30};
        MergeSort.mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

class MergeSort {
    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Fill the left array
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        // Corrected: Fill the right array
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the left and right arrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Collect remaining elements of left array
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Collect remaining elements of right array
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
