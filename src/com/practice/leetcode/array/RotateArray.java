package com.practice.leetcode.array;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * Leetcode: https://leetcode.com/problems/rotate-array/
 * Created by George Fouche on 11/27/18.
 */
public class RotateArray {



    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int [] nums2 = {-1,-100,3,99};

        System.out.println(Arrays.toString(rotateExample1(nums, 3)));

    }

    /**
     * Brute Force
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     * @param nums
     * @param k
     * @return
     */
    private static int[] rotateExample1(int[] nums, int k){
         int temp;
         int previous;

         for(int i =0; i<k;i++){
             previous = nums[nums.length-1];
             for(int j =0; j< nums.length;j++){
                 temp =nums[j];
                 nums[j] = previous;
                 previous =temp;
             }
         }
         return nums;
    }


    private static int[] rotateExample2(int[]nums,int k){
        int[] newArray = new int[nums.length];
        for(int i = 0; i < nums.length;i++){
            newArray[(i+k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArray[i];
        }
        return nums;
    }


}
