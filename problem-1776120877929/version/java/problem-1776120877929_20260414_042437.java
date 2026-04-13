// Last updated: 14/04/2026, 04:24:37
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] res= new int[nums.length];
4        int j=0;
5
6        for(int i=0;i<n;i++){
7            res[j++]=nums[i];
8            res[j++]=nums[i+n];
9        }
10        return res;
11        
12    }
13}