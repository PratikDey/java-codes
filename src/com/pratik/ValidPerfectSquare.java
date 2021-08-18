package com.pratik;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        boolean ans = isPerfectSquare(104976);
        System.out.println(ans);
    }
    static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        if(num == 1) {
            return true;
        } else {
            while(start <= end) {
                int mid = start + (end - start) / 2;
                int remainder = num % mid;
                if(mid == num/mid && remainder == 0) {
                    return true;
                } else if(mid > num / mid) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return false;
    }
}
