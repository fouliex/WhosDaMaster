package com.practice.leetcode.easy.array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int [] prices){
        int maxProfit =0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i< prices.length; i++){
            minPrice =  Math.min(prices[i], minPrice);
            maxProfit = Math.max(maxProfit, prices[i] -minPrice);
        }

        return maxProfit;
    }


    public static void main(String[] args) {
        //Sets up scenarios where the key is the input and the value is the expected output
        Map<int[],Integer> scenarios = new HashMap<int[],Integer>(){{
            put(new int[]{7, 1, 5, 3, 6, 4}, 5);
            put(new int[]{7,6,4,3,1}, 0);
        }};
        for(Map.Entry<int[],Integer> eachScenario : scenarios.entrySet()) {
            assert new BestTimeToBuyAndSellStock().maxProfit(eachScenario.getKey()) == eachScenario.getValue() : "Should evaluate to " + eachScenario.getValue();
        }
    }


}
