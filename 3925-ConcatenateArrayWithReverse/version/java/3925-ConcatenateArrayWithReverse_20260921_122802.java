// Last updated: 21/09/2026, 12:28:02
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int[] arr=Arrays.copyOf(nums,nums.length*2);
4        int idx=nums.length;
5         for(int j=nums.length-1;j>=0;j--){
6            arr[idx++]=nums[j];
7         }
8        return arr;
9    }
10}