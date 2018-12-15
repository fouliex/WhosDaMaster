package com.practice.leetcode.easy.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a sorted array nums, remove the duplicates in-place
 * such that each element appear only once and return the new length.
 * Leetcode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * Created by George Fouche on 11/26/18.
 */
public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] array1 = {1, 1, 2};
        int[] array2 = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(array1));
        System.out.println(removeDuplicates(array2));
        System.out.println();
        System.out.println(removeDuplicates2(array1));
        System.out.println(removeDuplicates2(array2));
    }

    private static int removeDuplicates(int[] array1) {

        if(array1 == null || array1.length == 0){
            return 0;
        }

        // 2 pointers technique
        int i = 0;
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] != array1[i]) {
                i++;
                array1[i] = array1[j];
            }
        }
        return i + 1;
    }


    private static int removeDuplicates2(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num : nums ){
            set.add(num);
        }

        return set.size();
    }
}
