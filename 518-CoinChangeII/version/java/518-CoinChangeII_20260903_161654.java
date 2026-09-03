// Last updated: 03/09/2026, 16:16:54
1class Solution {
2    public int change(int amount, int[] coins) {
3        int[][] dp= new int[coins.length+1][amount+1];
4        for(int[]d:dp){
5            Arrays.fill(d,-1);
6        }
7        int ans= helper(coins, amount, dp,0);
8        return ans==Integer.MAX_VALUE?-1:ans;
9    }
10    int helper(int[] coins, int amount, int[][]dp, int i){
11        if(amount==0){
12            return 1;
13        }
14        if(i>=coins.length)return 0;
15
16        if(dp[i][amount]!=-1){
17            return dp[i][amount];
18        }
19        int nottake= helper(coins, amount,dp,i+1);
20        int take=0;
21        if(coins[i]<=amount){
22            take=helper(coins, amount-coins[i],dp, i);
23            // if(res!=Integer.MAX_VALUE){
24            //     take=1+res;
25            // }
26        }
27        dp[i][amount]=take+nottake;
28        return dp[i][amount];
29
30     }
31}