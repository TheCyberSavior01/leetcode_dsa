package org.limon.SlidingWindow;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 1;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
                right++;
            } else {
                left = right;
                right++;
            }
        }

        return maxProfit;
    }
}
