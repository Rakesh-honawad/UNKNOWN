// Last updated: 29/08/2026, 17:17:47
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int res=0;
4        for(int i=0;i<nums.length;i++){
5            res+=nums[i];
6        }
7
8        int left=0;
9        for(int i=0;i<nums.length;i++){
10            int right=res-left-nums[i];
11            if(left==right)return i;
12            left+=nums[i];
13        }
14        return -1;
15
16    }
17}