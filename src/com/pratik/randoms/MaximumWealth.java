package com.pratik.randoms;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        int ans = maximumWealth(arr);
    }
    public static int maximumWealth(int[][] accounts) {
        int max_sum = 0;
        int curr_sum = 0;
        for(int i = 0; i < accounts.length; i++) {

            for(int j =0; j < accounts[i].length; j++) {
                curr_sum += accounts[i][j];
            }
            if(curr_sum > max_sum) {
                max_sum = curr_sum;
            }
        }
        return max_sum;
    }
}
