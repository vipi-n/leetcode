package com.vipin.leetcode.arrays;

// link https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

public class BestTimetouyAndSellStockII {

    public static void main(String[] args) {

    }

    class Solution {
        public int maxProfit(int[] prices) {

            int maxProfit = 0;

            for (int i = 1; i < prices.length; i++) {

                maxProfit += Math.max(0, prices[i] - prices[i - 1]);
            }
            return maxProfit;
        }
    }
}
