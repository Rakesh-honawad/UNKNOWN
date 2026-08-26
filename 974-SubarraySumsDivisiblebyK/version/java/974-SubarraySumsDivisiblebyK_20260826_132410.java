// Last updated: 26/08/2026, 13:24:10
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        Map<Integer,Integer> mp= new HashMap<>();
4        mp.put(0,1);
5        int count=0;
6        int sum=0;
7        for(int i=0;i<nums.length;i++){
8            sum+=nums[i];
9            int rem=sum%k;
10            if(rem<0){
11                rem+=k;
12            }
13            count+=mp.getOrDefault(rem,0);
14            mp.put(rem,mp.getOrDefault(rem,0)+1);
15        }
16        return count;
17        
18    }
19}