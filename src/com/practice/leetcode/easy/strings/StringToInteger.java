package com.practice.leetcode.easy.strings;

/**
 * Leetcode : https://leetcode.com/problems/string-to-integer-atoi/
 * Created by George Fouche on 12/7/18.
 */
public class StringToInteger {

    public static void main(String[] args) {

        String input1 = "123"; // Output 123
        String input2 = "  12  3";
        String input3 = "123@!123"; // Output 123
        String input4 = "-123"; // Output -123
        String input5 = "123456789012345"; // > return Integer.Max
        String input6 = "-1234567890123456"; // return Integer.Min

        System.out.println(myAtoi(input1));
        System.out.println(myAtoi(input2));
        System.out.println(myAtoi(input3));
        System.out.println(myAtoi(input4));
        System.out.println(myAtoi(input5));
        System.out.println(myAtoi(input6));


    }

    private static int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        double result = 0;

        // remove whitespace
        str = str.trim();

        //handle positive and negative sign
        boolean isNegative = false;
        int startIndex = 0; // index of first numerical character

        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            startIndex++;
        }
        if (str.charAt(0) == '-') {
            isNegative = true;
        }


        // handle normal case "123"
        for (int i = startIndex; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                break;
            }

            int digitValue = (int) str.charAt(i) - '0'; // ex. '9' - '0'
            result = result * 10 + digitValue;
        }

        // handle out of Integer range

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        if (isNegative) {
            result = -result;
        }
        return (int) result;
    }
}
