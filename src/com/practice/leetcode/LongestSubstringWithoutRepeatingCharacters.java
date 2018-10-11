package com.practice.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Created by George Fouche on 10/8/18.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
       LongestSubstringWithoutRepeatingCharacters  longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(longestSubstringWithoutRepeatingCharacters.longestSubsString("abcbb"));
    }

    private int longestSubsString(String str) {
        Set<Character> set = new HashSet<Character>();
        int ans =0;
        int i =0;
        int j =0;

        while (i < str.length() && j < str.length()){
            if(!set.contains(str.charAt(j))){
                set.add(str.charAt(j++));
                ans = Math.max(ans,j-i);
            }else{
                set.remove(str.charAt(i++));
            }
        }
        return ans;

    }
}
