package com.pratik.randoms;

import java.util.Arrays;

class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        boolean val = containsDuplicate(arr);
        System.out.println(val);
    }
    public static boolean containsDuplicate(int[] arr) {
        int i = 0;
        boolean ans = false;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr.length > 1 && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] == j) {
                ans = false;
            } else {
                ans = true;
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}