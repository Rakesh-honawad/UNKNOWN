// Last updated: 30/09/2026, 22:11:49
1class Solution {
2    public int minElement(int[] nums) {
3        int[] ans= new int[nums.length];
4        for(int i=0;i<nums.length;i++){
5            int res=0;
6            while(nums[i]>0){
7                int ind=nums[i]%10;
8                res+=ind;
9                nums[i]/=10;
10            }
11            nums[i]=res;
12        }
13       
14      int min=nums[0];
15       for(int n:nums){
16        if(n<min){
17            min=n;
18        }
19       }
20       return min;
21    }
22}