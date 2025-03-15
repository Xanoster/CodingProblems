package com.company;

public class buynSellStocks {
    public static void buyNsell(int prices[]) {
       int buyPrice=Integer.MAX_VALUE;
       int maxProfit=0;
       for(int i=0;i<prices.length;i++){
           if(buyPrice<prices[i]) {
               int profit = prices[i] - buyPrice;
               maxProfit = Math.max(maxProfit, profit);
           }
               else{
                   buyPrice=prices[i];
            }
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        int prices[] = {7,2,7, 1, 5, 3, 2, 5};
        buyNsell(prices);
    }
}
