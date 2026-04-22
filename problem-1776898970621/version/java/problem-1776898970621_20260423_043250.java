// Last updated: 23/04/2026, 04:32:50
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int max=nums[0];
4        int curr=0;
5        for(int num:nums){
6            curr+=num;
7            max=Math.max(max,curr);
8            if(curr<=0)curr=0;
9        }
10        return max;
11                 
12    }
13}