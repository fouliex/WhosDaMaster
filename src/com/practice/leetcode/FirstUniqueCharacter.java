package com.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 */
public class FirstUniqueCharacter {


    public int firstUniqCharExample1(String s) {

        Map<Character, Integer> map = new HashMap();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), ++count);
                count = 1;
            } else {
                map.put(s.charAt(i), count);
            }

        }
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (map.containsKey(letter) && (map.get(letter) == 1)) {
                return i;
            }
        }

        return -1;
    }

    public int firstUniqCharExample2(String s){
        if (s == null || s.length() == 0) {
            return -1;
        }

        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(new FirstUniqueCharacter().firstUniqCharExample1("leetcode"));
        System.out.println(new FirstUniqueCharacter().firstUniqCharExample1("loveleetcode"));
        System.out.println(new FirstUniqueCharacter().firstUniqCharExample2("leetcode"));
        System.out.println(new FirstUniqueCharacter().firstUniqCharExample2("loveleetcode"));
        System.out.println(new FirstUniqueCharacter().firstUniqCharExample2("bcdefg"));

    }
}
