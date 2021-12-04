package com.pratik.randoms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> ans_map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if(ans_map.containsKey(complement)) {
                return new int[] {ans_map.get(complement), i};
            }
            ans_map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match found");
    }
}
