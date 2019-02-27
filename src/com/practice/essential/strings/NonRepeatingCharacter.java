package com.practice.essential.strings;


import java.util.HashMap;
import java.util.Map;

/**
 * Non-repeating Character
 *
 * Implement a function that takes a string and returns the first character that does not appear twice or more.
 * For example:
 * "abacc" -> 'b' ('a' appears twice and so does 'c'
 * "xxyzx" -> 'y' 'y' ( 'y'
 *
 */
public class NonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(nonRepeating("abcab")); // should return 'c'
        nonRepeating("abab"); // should return null
        nonRepeating("aabbbc"); // should return 'c'
        nonRepeating("aabbdbc"); // should return 'd'
    }

    private static Character nonRepeating(String s) {
        Map<Character,Integer> charCount = new HashMap<>();

        for(char c : s.toCharArray()){
            if(charCount.containsKey(c)){
                charCount.put(c,charCount.get(c) +1);
            }else{
                charCount.put(c,1);
            }

        }

        for(char c : s.toCharArray()){
            if(charCount.get(c) == 1){
                return c;
            }
        }
        return null;
    }
}
