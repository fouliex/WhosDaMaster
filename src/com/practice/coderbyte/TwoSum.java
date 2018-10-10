package com.practice.coderbyte;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * Created by George Fouche on 10/8/18.
 */
public class TwoSum {
    Map<Integer,Integer> map = new HashMap();

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                return new int[]{map.get(value), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];

    }


    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = { 11, 15,2, 7};
        int[] george = twoSum.twoSum2(arr,9);
        System.out.println(Arrays.toString(george));

    }
}
