// Last updated: 13/09/2026, 14:04:53
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i=0;
4        int j=1;
5        while(j<nums.length){
6            if(nums[i]!=nums[j]){
7                i++;
8                nums[i]=nums[j];
9            }
10            j++;
11        }
12        return i+1;
13    }
14}