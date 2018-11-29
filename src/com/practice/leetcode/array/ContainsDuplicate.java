package com.practice.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * Leetcode: https://leetcode.com/problems/contains-duplicate/
 * Created by George Fouche on 11/27/18.
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 1};
        int[] array2 = {1, 2, 3, 4};

        System.out.println(containsDuplicate(array1));
        System.out.println(containsDuplicate(array2));


    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
