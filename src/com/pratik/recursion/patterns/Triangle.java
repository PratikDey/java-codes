package com.pratik.recursion.patterns;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
//        triangle2(4, 0);
        int[] arr = {4, 3, 2, 1};

        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int r, int c, int maxVal) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            if(arr[c] > arr[maxVal]) {
                selection(arr, r, c+1, c);
            } else {
                selection(arr, r, c+1, maxVal);
            }

        } else {
            swap(arr, r-1, maxVal);
            selection(arr, r - 1, 0, 0);
        }
    }

    static void bubble(int[] arr, int r, int c) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            if(arr[c] > arr[c + 1]) {
                //swap
                swap(arr, c, c+1);
            }
            bubble(arr, r, c+1);
        } else {

            bubble(arr, r - 1, 0);
        }
    }

    private static void swap(int[] arr,int c, int d) {
        int temp = arr[c];
        arr[c] = arr[d];
        arr[d] = temp;
    }


    static void triangle2(int r, int c) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            triangle2(r, c+1);
            System.out.print("*");

        } else {
            triangle2(r - 1, 0);
            System.out.println();

        }
    }

    static void triangle(int r, int c) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            System.out.print("*");
            triangle(r, c+1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }
}
