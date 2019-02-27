package com.practice.essential.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Most Frequently Occurring Item in an Array
 * Example 1:
 * The most frequently occurring item in [1,3,1,3,2,1] is 1.
 * If you're given an empty array, you should return null
 *
 * You can assume that there is always a single unique
 */
public class MostFrequentItem {


    public static void main(String[] args) {

        // mostFrequent(array1) should return 1.
        int [] array1 = {1,3,1,3,2,1};

        System.out.println(mostFrequent(array1));

    }

    public static Integer mostFrequent(int [] givenArray){
        Integer maxCount = Integer.MIN_VALUE;
        Integer maxItem = null;
        Map <Integer,Integer> map =  new HashMap();

        for( int num : givenArray){
            if(map.containsKey(num)){
                map.put(num ,map.get(num)+ 1 );
            }else{
                map.put(num,1);
            }
            if(map.get(num) > maxCount){
                maxCount= map.get(num);
                maxItem = num;
            }

        }

        for (int num : givenArray){
            if(map.get(num) > maxCount){
                maxCount= map.get(num);
                maxItem = num;
            }
        }
        return maxItem;
    }
}
