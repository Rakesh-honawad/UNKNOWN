// Last updated: 09/04/2026, 00:36:57
1class Solution {
2    public int singleNumber(int[] nums) {
3        int idx=0;
4        for(int num:nums){
5            idx=num^idx;
6            num++;
7        }
8        return idx;
9        
10        
11        
12    }
13}