package com.pratik.randoms;

public class ArrangingCoins {
    public static void main(String[] args) {
        int coins = 5;
        int ans = arrangingCoins(coins);
        System.out.println(ans);
    }
    static int arrangingCoins(int n) {
        int start = 1;
        int end = n;
        int mid = 0;
        while(start<=end)
        {
            mid = start + (end-start)/2;
            int sum = (mid * (mid + 1))/2;
            if(sum > n)
            {
                end = mid-1;

            }
            else if(sum < n)
            {
                start = mid+1;

            }
            else
            {
                return mid;
            }
        }
        return mid-1;
    }
}
