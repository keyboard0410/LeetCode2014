package leetcode;

import java.util.Arrays;

public class BestTimetoBuyandSellStockIII {

	public static int maxProfit(int[] prices) {
		if(prices == null || prices.length < 2) {
            return 0;
        }
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];
        
        int min = prices[0];
        left[0] = 0;
        for(int i = 1; i < prices.length; i++) {
        	left[i] = Math.max(left[i-1], prices[i] - min);
        	min = Math.min(min, prices[i]);
        }
        
        int max = prices[prices.length -1];
        right[prices.length-1] = 0;
        for(int j = prices.length-2; j>=0; j--) {
        	right[j] = Math.max(right[j+1], max-prices[j]);
        	max = Math.max(max, prices[j]);
        }
        
        //System.out.println(Arrays.toString(left));  
	    //System.out.println(Arrays.toString(right));  
        int res = 0;
        for(int m = 0; m < prices.length; m++) {
        	res = Math.max(res, left[m] + right[m]);
        }
        return res;
	}
	public static void main(String[] args) {
		int[] prices = {1,3,6,8};
		System.out.println(maxProfit(prices));
	}

}
