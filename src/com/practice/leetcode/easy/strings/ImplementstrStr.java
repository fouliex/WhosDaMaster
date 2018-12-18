package com.practice.leetcode.easy.strings;

/**
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Leetcode: https://leetcode.com/problems/implement-strstr/
 * Created by George Fouche on 12/7/18.
 */
public class ImplementstrStr {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        System.out.println(strStr(haystack,needle));
    }

    private static int strStr(String haystack, String needle) {
        if(haystack == null || needle == null){
            return -1;
        }

        for (int i = 0; i < haystack.length() - needle.length() +1; i++){
            int j;
            for(j= 0; j<needle.length();j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
            if (j == needle.length()){
                return i;
            }
        }

        return -1;
    }

}
