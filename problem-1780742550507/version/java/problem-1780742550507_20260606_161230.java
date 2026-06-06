// Last updated: 06/06/2026, 16:12:30
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int[] left= new int[nums.length];
4        int[] right= new int[nums.length];
5        int[] ans= new int[nums.length];
6        for(int i=1;i<nums.length;i++){
7            left[i]=left[i-1]+nums[i-1];
8        }
9        for(int i=nums.length-2;i>=0;i--){
10            right[i]=right[i+1]+nums[i+1];
11        }
12        for(int i=0;i<nums.length;i++){
13            ans[i]=Math.abs(left[i]-right[i]);
14        }
15        return ans;
16    }
17}