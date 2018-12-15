package com.practice.leetcode.easy.strings;

/**
 * Write a function that takes a string as input and returns the string reversed.
 * leetcode: https://leetcode.com/problems/reverse-string/
 * Created by George Fouche on 12/7/18.
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
        System.out.println(reverseString("A man, a plan, a canal: Panama"));
    }

    private static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length() -1;  i>= 0; i--){
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }


}
