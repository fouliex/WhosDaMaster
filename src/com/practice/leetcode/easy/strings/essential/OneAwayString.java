package com.practice.leetcode.easy.strings.essential;

/**
 * One Away String
 *
 * Write a function that takes two strings and returns true if they are one away from each other.
 *
 * They are one away from each other if a single operation(changing a character,deleting a character or adding a character)
 * will change one of the strings to the other.
 *
 * Examples:
 *
 * "abcde" and "abcd" are one  away(deleting a character).
 * "a" and "a" are one away (changing the only character 'a' to the equivalent character 'a')
 * "abc" and "bcc" are NOT one away. (They are two operations away)
 *
 *
 */
public class OneAwayString {
    public static void main(String[] args) {
        isOneAway("abcde", "abcd");  // should return true
        isOneAway("abde", "abcde");  // should return true
        isOneAway("a", "a");  // should return true
        isOneAway("abcdef", "abqdef");  // should return true
        isOneAway("abcdef", "abccef");  // should return true
        isOneAway("abcdef", "abcde");  // should return true
        isOneAway("aaa", "abc");  // should return false
        isOneAway("abcde", "abc");  // should return false
        isOneAway("abc", "abcde");  // should return false
        isOneAway("abc", "bcc");  // should return false
    }

    private static boolean isOneAway(String s1, String s2) {

        if(s1.length() - s2.length() >=2 || s2.length() -s1.length() >=2){
            return false;
        }else if (s1.length() == s2.length()){
            return isOneAwaySameLength(s1,s2);
        }else if(s1.length() > s2.length()){
            return isOneAwayDiffLengths(s1,s2);
        }else {
            return isOneAwayDiffLengths(s2,s1);
        }
    }
    private static boolean isOneAwaySameLength(String s1, String s2) {
        int countDiff =0;
        for(int i =0; i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                countDiff +=1;
                if(countDiff >1){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isOneAwayDiffLengths(String s1, String s2) {
        int i = 0;
        int countDiff = 0;
        while (i < s2.length()) {
            if (s1.charAt(i + countDiff) == s2.charAt(i)) {
                i += 1;
            } else {
                countDiff += 1;
            }
            if (countDiff > 1) {
                return false;
            }
        }
        return true;
    }



}
