// Last updated: 15/09/2026, 17:44:09
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n=nums.length;
4         int[][]dp=new int[n][n+1];
5         for(int[] d:dp){
6            Arrays.fill(d,-1);
7         }
8         return helper(0,-1,nums,dp);        
9    }
10    int helper(int i,int prev,int[] nums, int[][]dp){
11        if(i==nums.length)return 0;
12        if(dp[i][prev+1]!=-1){
13            return dp[i][prev+1];
14        }
15        int nottake=helper(i+1,prev,nums,dp);
16        int take=0;
17        if(prev==-1||nums[i]>nums[prev]){
18            take=1+helper(i+1,i,nums,dp);
19        }
20        return dp[i][prev+1]=Math.max(nottake,take);
21    }
22}