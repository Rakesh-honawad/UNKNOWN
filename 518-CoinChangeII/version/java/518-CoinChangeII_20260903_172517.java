// Last updated: 03/09/2026, 17:25:17
1class Solution {
2    public int change(int amount, int[] coins) {
3        int[][] dp= new int[coins.length+1][amount+1];
4        for(int[]d:dp){
5            Arrays.fill(d,-1);
6        }
7        return helper(coins, amount, dp,0);
8    }
9    int helper(int[] coins, int amount, int[][]dp, int i){
10        if(amount==0){
11            return 1;
12        }
13        if(i>=coins.length)return 0;
14
15        if(dp[i][amount]!=-1){
16            return dp[i][amount];
17        }
18        int nottake= helper(coins, amount,dp,i+1);
19        int take=0;
20        if(coins[i]<=amount){
21            take=helper(coins, amount-coins[i],dp, i);
22            // if(res!=Integer.MAX_VALUE){
23            //     take=1+res;
24            // }
25        }
26        dp[i][amount]=take+nottake;
27        return dp[i][amount];
28
29     }
30}