// Last updated: 23/04/2026, 04:31:45
1class Solution {
2    public int maxSubArray(int[] nums) {
3      int max=nums[0];
4      int current=0;
5      for(int num:nums){
6         current+=num;
7           max=Math.max(max,current);
8            if(current<0){
9                current=0;
10            }
11        }
12      return max;
13    }
14}