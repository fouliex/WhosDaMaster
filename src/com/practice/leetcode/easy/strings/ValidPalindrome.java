package com.practice.leetcode.easy.strings;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * Created by George Fouche on 12/7/18.
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input));
        System.out.println(isPalindromeExample2(input));
    }

    private static boolean isPalindrome(String input) {
        int i = 0;
        int j = input.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(input.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(input.charAt(j))) {
                j--;
            }

            if (i < j && Character.toLowerCase(input.charAt(i++)) != Character.toLowerCase(input.charAt(j--))) {
               return false;
            }
        }

        return true;
    }

    private static boolean isPalindromeExample2(String input){
        String clear = input.replace("[^a-zA-Z0-9]+", "");
        System.out.println(clear);
        StringBuilder sb = new StringBuilder(clear).reverse();
        return sb.toString().equalsIgnoreCase(clear);
    }
}
