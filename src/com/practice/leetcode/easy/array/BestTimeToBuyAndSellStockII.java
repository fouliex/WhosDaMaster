package com.practice.leetcode.easy.array;

/**
 *Design an algorithm to find the maximum profit.
 * You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times).
 * However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * Leetcode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 * Created by George Fouche on 11/27/18.
 */
public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{1,2,3,4,5}));
    }

    private static int maxProfit(int[] prices) {

        int maxProfit =0;

        if(prices.length <= 1){
            return maxProfit;
        }

        for(int i =1; i < prices.length;i++){
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }

        return maxProfit;
    }
}
