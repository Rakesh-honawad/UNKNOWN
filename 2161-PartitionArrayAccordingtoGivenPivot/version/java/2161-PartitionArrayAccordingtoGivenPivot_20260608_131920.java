// Last updated: 08/06/2026, 13:19:20
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        int[] res=new int[nums.length];
4        int in=0;
5        for(int num:nums)
6            if(num<pivot){
7                res[in++]=num;
8            }
9        // res[in++]=pivot;    
10        for(int num:nums)
11            if(num==pivot){
12                res[in++]=pivot;
13            }
14        for(int num:nums)
15            if(num>pivot) {
16                res[in++]=num;
17            }    
18        return res;
19    }
20}