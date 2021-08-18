package com.pratik;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0 , 2, 3, 4, 15, 16, 18, 20, 22, 45, 89};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        boolean asc = arr[start] < arr[end];
        if(target == arr[mid]) return mid;
        else if(asc) {
            while(start <= end) {
                mid = start + (end - start) / 2;
                if(target < arr[mid]) {
                    end = mid - 1;
                } else if(target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        } else {
            while(start <= end) {
                mid = start + (end - start) / 2;
                if(target > arr[mid]) {
                    end = mid - 1;
                } else if(target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
