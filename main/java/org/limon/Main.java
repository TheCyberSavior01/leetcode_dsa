package org.limon;


import org.limon.Array.SecondMaximumValue;
import org.limon.Searching.BinarySearch;
import org.limon.SlidingWindow.BestTimeToBuyAndSellStock;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 6, 6, 11, 13, 1};
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        System.out.println(bestTimeToBuyAndSellStock.maxProfit(arr));

    }

}