// Last updated: 02/03/2026, 17:04:50
// Easy solution for the MAth Array
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int sum=0;
4        for(int num:nums){
5            sum+=num;
6        }
7        return sum%k;
8        
9    }
10}