package com.pratik;

public class TwoSumSortedArray {
    public static void main(String[] args) {
        int[] ans = new int[2];
        int[] numbers = {2, 3, 4};
        int target = 6;
        ans = twoSum(numbers, target);
        System.out.println(ans);
    }
    static int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = 0;
        int start = 0;
        int end = numbers.length;
        int[] ans = new int[2];
        while(start < end) {
            int mid = start + (end - start) / 2;

            if(target < numbers[mid]) {
                end = mid - 1;
                index2 = end;
            }else if(target > mid) {
                start = mid + 1;

            }
        }
        for(int i = 0; i < numbers.length; i++) {
            if(target - numbers[index2] == numbers[i]) {
                index1 = i;
            }
        }
        index1 = index1 + 1;
        index2 = index2++;
        ans[0] = index1;
        ans[1] = index2;
        return ans;
    }
}
