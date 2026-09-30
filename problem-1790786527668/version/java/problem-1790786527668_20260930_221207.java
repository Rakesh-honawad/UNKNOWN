// Last updated: 30/09/2026, 22:12:07
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
12       
13      int min=nums[0];
14       for(int n:nums){
15        if(n<min){
16            min=n;
17        }
18       }
19       return min;
20    }
21}