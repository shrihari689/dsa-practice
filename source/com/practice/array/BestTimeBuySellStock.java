package com.practice.array;

public class BestTimeBuySellStock {

    public int maxProfit(int[] prices) {

        int n = prices.length;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n; ++i) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeBuySellStock sellStock = new BestTimeBuySellStock();
        System.out.println(sellStock.maxProfit(new int[] { 3, 2, 6, 5, 0, 3 }));
        System.out.println(sellStock.maxProfit(new int[] { 1 }));
        System.out.println(sellStock.maxProfit(new int[] { 1, 4, 2 }));
        System.out.println(sellStock.maxProfit(new int[] { 10, 7, 5, 8, 11, 9 }));
        System.out.println(sellStock.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
        System.out.println(sellStock.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
    }
}
