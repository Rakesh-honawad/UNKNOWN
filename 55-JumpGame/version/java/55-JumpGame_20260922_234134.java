// Last updated: 22/09/2026, 23:41:34
1class Solution {
2    public boolean canJump(int[] nums) {
3        // int reachable=0;
4        // for(int i=0;i<nums.length;i++){
5        //     if(i>reachable)return false;
6        //     reachable=Math.max(reachable,i+nums[i]);
7        // }
8        // return true;\
9       
10        int n= nums.length - 1;
11        
12        for (int i = nums.length - 2; i >= 0; i--) {
13            // If from position i we can reach lastGoodIndex
14            if (i + nums[i] >= n) {
15                n=i;;
16            }
17        }
18        
19        return n==0;
20
21    }
22}