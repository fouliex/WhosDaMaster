package com.practice.leetcode.array;

import java.util.*;

/**
 * Leetcode: https://leetcode.com/problems/intersection-of-two-arrays/
 * Created by George Fouche on 11/27/18.
 */
public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};

        int[] nums5 = {2, 3, 6, 7, 9, 11};
        int[] nums6 = {4, 6, 8, 9, 12};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
        System.out.println();
        intersectionExample2(nums1,nums2);


    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        Set set = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                resultList.add(num);
                set.remove(num);
            }
        }

        int[] result = new int[resultList.size()];
        int i = 0;
        for (Integer num : resultList) {
            result[i++] = num;
        }

        return result;
    }

    private static void intersectionExample2(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                System.out.println(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
    }

}
