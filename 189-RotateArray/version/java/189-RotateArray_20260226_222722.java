// Last updated: 26/02/2026, 22:27:22
// Longest increasing length
1class Solution {
2    public int findLengthOfLCIS(int[] nums) {
3        int max=1;
4        int count=1;
5        for(int i=1;i<nums.length;i++){
6           
7            if(nums[i]>nums[i-1]){
8                count++; 
9                 max=Math.max(max,count); 
10            }
11            else{
12                count=1;
13            }
14        
15           
16        }
17        return max;
18        
19    }
20}