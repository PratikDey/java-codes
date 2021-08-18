package com.pratik;

public class FlipAndInvertImage {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = horizontalFlip(arr[i], 0, 2);
            //System.out.println(Arrays.toString(arr[i]));
        }
        arr = invert(arr);
        //System.out.print(arr);
    }

    static int[][] invert(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if(ints[i][j] == 0) {
                    ints[i][j] = 1;
                } else {
                    ints[i][j] = 0;
                }
            }
        }
        return ints;
    }

    static int[] horizontalFlip(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
