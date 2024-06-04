package org.limon.SlidingWindow;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = 0;
        int sell = 1;

        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) {
                int profit = prices[sell] - prices[buy];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
                sell++;
            } else {
                buy = sell;
                sell++;
            }
        }

        return maxProfit;
    }
}
