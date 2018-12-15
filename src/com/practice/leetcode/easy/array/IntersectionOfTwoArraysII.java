package com.practice.leetcode.easy.array;

import java.util.*;

/**
 * Leetcode: https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * Created by George Fouche on 12/3/18.
 */
public class IntersectionOfTwoArraysII {

    public static void main(String[] args) {

        int[] nums1 =  {4,9,5};
        int [] nums2 =  {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));


    }

    @SuppressWarnings("Duplicates")
    public static int[] intersection(int[] nums1, int[] nums2) {
        List list = new ArrayList();
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums1) {
            list.add(num);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (list.contains(nums2[i])) {
                resultList.add(nums2[i]);
                list.remove(new Integer(nums2[i])); //index
            }
        }
        int[] result = new int[resultList.size()];
        int i = 0;
        for (Integer num : resultList) {
            result[i++] = num;
        }

        return result;
    }
}
