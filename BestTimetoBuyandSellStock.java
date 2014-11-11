package leetcode;
/*
Author:     Gang Liu, liugang.zzq@gmail.com
Date:       May 28, 2014
Problem:    Best Time to Buy and Sell Stock
Source:     https://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock/

Notes:
Say you have an array for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
design an algorithm to find the maximum profit.

*/
public class BestTimetoBuyandSellStock {

	public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
		int profit = 0;
		int min = prices[0];
		for(int i = 0; i < prices.length; i++) {
			min = Math.min(min, prices[i]);
			profit = Math.max(profit, prices[i] - min);
		}
        return profit;
    }

	public static void main(String[] args) {
		int[] prices = {1,2,6,4,8,11,3,54,6,34};
		System.out.println(maxProfit(prices));
	}

}
