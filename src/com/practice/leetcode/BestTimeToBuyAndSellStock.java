package com.practice.leetcode;

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
        int [] prices = {7,1,5,3,6,4};
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(prices));
    }


}
