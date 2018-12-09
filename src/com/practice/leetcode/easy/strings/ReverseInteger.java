package com.practice.leetcode.easy.strings;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Leetcode: https://leetcode.com/problems/reverse-integer/
 * Created by George Fouche on 12/7/18.
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
    }

    private static int reverseInteger(int num) {
        int lastDigit;
        int temp;
        int reversed =0;

        while(num!= 0){
            lastDigit = num %10;
            temp = reversed * 10 + lastDigit;
            num = num/10;// rest of digit until 0

            // check for overflow
            if(temp/10 != reversed || temp%10 != lastDigit)return 0;

            reversed = temp;
        }
        return reversed;
    }
}
