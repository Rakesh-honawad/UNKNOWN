// Last updated: 26/08/2026, 12:18:43
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] res= new int[nums.length];
4        res[0]=1;
5        for(int i=1;i<nums.length;i++){
6            res[i]=res[i-1]*nums[i-1];
7        }
8        
9        int right=1;
10        for(int i=nums.length-1;i>=0;i--){
11            res[i]=res[i]*right; 
12            right*=nums[i];      
13        }
14        return res;
15        
16    }
17}