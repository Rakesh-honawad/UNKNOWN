// Last updated: 30/09/2026, 22:12:20
1class Solution {
2    public int minElement(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int res=0;
5            while(nums[i]>0){
6                int ind=nums[i]%10;
7                res+=ind;
8                nums[i]/=10;
9            }
10            nums[i]=res;
11        }    
12      int min=nums[0];
13       for(int n:nums){
14        if(n<min){
15            min=n;
16        }
17       }
18       return min;
19    }
20}