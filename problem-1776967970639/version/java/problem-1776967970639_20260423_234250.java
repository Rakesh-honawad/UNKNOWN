// Last updated: 23/04/2026, 23:42:50
1class Solution {
2    public int minPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int sum=0;
5        int i=0;
6        int j=nums.length-1;
7        while(i<j){
8          int res = nums[i]+nums[j];
9           sum= Math.max(sum,res);
10           i++;j--;
11        }
12        return sum;
13    }
14}