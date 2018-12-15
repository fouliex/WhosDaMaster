package com.practice.leetcode.easy.array;

import java.util.*;

/**
 *
 * Leetcode: https://leetcode.com/problems/two-sum/
 * Created by George Fouche on 11/27/18.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};

        System.out.println(Arrays.toString(twoSums(nums,9)));
        
    }

    private static int[] twoSums(int[] nums, int target) {
        List<Integer> map = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int value = target - nums[i];
            if(map.contains(value)){
                return new int[]{nums[i],value};
            }else{
                map.add(nums[i]);
            }
        }
        return new int[0];
    }

}
