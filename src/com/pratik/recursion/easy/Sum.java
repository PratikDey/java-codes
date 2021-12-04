package com.pratik.recursion.easy;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sumOfN(5));
    }
    static int sumOfN(int n) {
        if(n <= 1) {
            return n;
        }
        int ans = n + sumOfN(n - 1);
        return ans;
    }
}
