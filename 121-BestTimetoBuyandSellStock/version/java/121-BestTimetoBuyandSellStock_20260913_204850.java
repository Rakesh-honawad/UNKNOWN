// Last updated: 13/09/2026, 20:48:50
1class Solution {
2    public int maxProfit(int[] prices) {
3        int profit=0;
4        int min=prices[0];
5        for(int i=1;i<prices.length;i++){
6            if(prices[i]<min){
7                min=prices[i];
8            }
9            profit=Math.max(profit,prices[i]-min);
10        }
11        return profit;
12    }
13}