package com.pratik;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int[] ans = shuffle(nums, 3);
        System.out.println(ans);
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < n; i++) {
            int j = i + n;
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[j];
        }
        return ans;
    }
}
