// Last updated: 03/09/2026, 16:02:01
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int n= coins.length;
4        int[][]dp= new  int[n+1][amount+1];
5        for(int[] d:dp){
6            Arrays.fill(d,-1);
7        }
8       int ans= helper(coins,amount, 0,dp);
9       return ans==Integer.MAX_VALUE?-1:ans;
10    }
11    int helper(int[] coins, int amount, int i, int[][]dp){
12        if(i>=coins.length){
13            return Integer.MAX_VALUE;
14        }
15        if(amount==0)return 0;
16        if(dp[i][amount]!=-1){
17            return dp[i][amount];
18        }
19        int nottake=helper(coins, amount, i+1,dp);
20        int take=Integer.MAX_VALUE;
21        if(coins[i]<=amount){
22            int temp=helper(coins, amount-coins[i],i,dp);
23            if(temp!=Integer.MAX_VALUE){
24                take=1+temp;
25            }
26        }
27        dp[i][amount]=Math.min(take,nottake);
28        return dp[i][amount];
29    }
30}