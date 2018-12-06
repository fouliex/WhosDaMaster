package com.practice.leetcode.array;

import java.util.Arrays;

/**
 *Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Leetcode: https://leetcode.com/problems/move-zeroes/
 * Created by George Fouche on 11/27/18.
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));

    }
    public static int[] moveZeroes(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;

            }
        }
        while(count < nums.length){
            nums[count] = 0;
            count++;
        }

        return nums;

    }

}
