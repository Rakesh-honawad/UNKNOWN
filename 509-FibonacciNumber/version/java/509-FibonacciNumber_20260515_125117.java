// Last updated: 15/05/2026, 12:51:17
1class Solution {
2    public int fib(int n) {
3        int[] dp= new int[n+1];
4        if(n<=1)return n;
5        if(dp[n]==n)return dp[n];
6        return dp[n]=fib(n-1)+fib(n-2);
7        
8    }
9}