// Last updated: 14/04/2026, 04:15:15
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] res= new int[nums.length *2];
4        for(int i=0;i<nums.length;i++){
5            res[i]=nums[i];
6     
7        }
8          for(int i=0;i<nums.length;i++){
9            res[nums.length+i]=nums[i];
10     
11        }
12         return res;
13        
14    }
15}