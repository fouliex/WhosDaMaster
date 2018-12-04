package com.practice.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by George Fouche on 11/27/18.
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums =  {2,2,1};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0 ; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);

            }else{
               map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for( Integer num : nums){
            if(map.get(num) == 1){
                return num;
            }
        }
        return 0;
    }

}
