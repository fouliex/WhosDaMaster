package com.practice.leetcode.easy.strings;

import java.util.Arrays;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s
 * <p>
 * Created by George Fouche on 12/7/18.
 */
public class ValidAnagram {

    public static void main(String[] args) {
        String input1 = "anagram";
        String input2 = "nagaram";

        System.out.println(isAnagram(input1,input2));
    }

    private static boolean isAnagram(String input1, String input2) {
        if(input1.length() != input2.length()){
            return false;
        }
        char[] chars1 = input1.toCharArray();
        char[] chars2 = input2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1,chars2);
    }
}
