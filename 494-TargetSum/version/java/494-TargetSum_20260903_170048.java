// Last updated: 03/09/2026, 17:00:48
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        int offset=1000;
4        int[][]dp= new int[nums.length][2001];
5        for(int[]d:dp){
6            Arrays.fill(d,-1);
7        }
8        return helper(nums,target,0,dp,offset);
9    }
10    int helper(int[] nums, int target, int i, int[][] dp, int offset){
11        if (i == nums.length) {
12            return target == 0 ? 1 : 0;
13        }
14        
15        if (target + offset < 0 || target + offset >= 2001) {
16            return 0;
17        }
18
19        if(dp[i][target +offset]!=-1){
20            return dp[i][target+offset];
21        }
22        int minus=helper(nums,target-nums[i],i+1,dp,offset);
23        int plus=helper(nums,target+nums[i],i+1,dp,offset);
24        dp[i][target+offset]=minus+plus;
25        return dp[i][target+offset];
26    }
27}