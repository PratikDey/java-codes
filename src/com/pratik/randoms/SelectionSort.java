package com.pratik.randoms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = maxIndex(arr, 0, lastIndex);
            swapped(arr, maxIndex, lastIndex);
        }
    }

    private static void swapped(int[] arr, int maxIndex, int lastIndex) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        }

    }

    private static int maxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
