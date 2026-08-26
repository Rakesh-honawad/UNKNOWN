// Last updated: 26/08/2026, 15:11:56
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3
4        int count=0;
5        int left=0;
6        if(k<=1)return 0;
7        int product=1;
8        for(int i=0;i<nums.length;i++){
9            product*=nums[i];
10            while(product>=k){
11                product/=nums[left];
12                left++;
13            }
14            count+=(i-left+1);
15        }
16        return count;
17        
18    }
19}