package com.pratik.randoms;

public class SqrtOfX {
    public static void main(String[] args) {
        int ans = sqrt(5);
        System.out.println(ans);
    }
    public static int sqrt(int x) {
        int start = 1;
        int end = x;
        int ans = 0;
        if(x == 0 || x == 1) {
            return x;
        } else {
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if(mid * mid < x) {
                    start = mid + 1;
                    ans = mid;
                } else if (mid * mid > x) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return ans;
    }
}
