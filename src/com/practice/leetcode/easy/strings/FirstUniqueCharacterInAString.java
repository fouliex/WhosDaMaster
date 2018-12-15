package com.practice.leetcode.easy.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * Leetcode: https://leetcode.com/problems/first-unique-character-in-a-string/
 * Created by George Fouche on 12/7/18.
 */
public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("leetcode"));
        System.out.println(firstUniqueCharExample2("leetcode"));
    }

    private static int firstUniqueChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int count =1;
        for( int i = 0 ; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
               map.put(s.charAt(i),++count);
            }else{
                map.put(s.charAt(i),count);
            }
        }
        for(int i = 0; i < s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    /**
     * Letters need to be lowercase
     * @param s
     * @return
     */
    private static int firstUniqueCharExample2(String s){
        int [] charCount = new int[26];

        for(int i =0; i < s.length(); i++){
            charCount[s.charAt(i) - 'a'] +=1;
        }

        for(int i = 0; i < s.length(); i++){
            if(charCount[s.charAt(i) - 'a']==1){
                return i;
            }
        }
        return -1;

    }
}
