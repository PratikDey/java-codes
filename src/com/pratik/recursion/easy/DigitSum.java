package com.pratik.recursion.easy;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(1234));
    }
    static int digitSum(int n) {
        if(n == 1) {
            return 1;
        }
        int ans = (n % 10) + digitSum(n / 10);
        return ans;
    }
}
