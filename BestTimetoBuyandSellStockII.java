package leetcode;

public class BestTimetoBuyandSellStockII {
	
	public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
		int profit = 0;
		int min = prices[0];
		for(int i = 0; i < prices.length - 1; i++) {
			int temp = prices[i+1] - prices[i];
			if(temp > 0) {
				profit += temp;
			}
		}
        return profit;
    }

	public static void main(String[] args) {
		int[] prices = {1,2,6,4,8,11,3,54,6,34};
		System.out.println(maxProfit(prices));
	}

}
