// Last updated: 27/08/2026, 11:04:47
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        HashMap<Integer,Integer>mp= new HashMap<>();
4        mp.put(0,1);
5        int sum=0;
6        int count=0;
7        for(int i=0;i<nums.length;i++){
8            sum+=nums[i];
9            if(mp.containsKey(sum-goal)){
10                count+=mp.get(sum-goal);
11            }
12            mp.put(sum,mp.getOrDefault(sum,0)+1);
13        }
14        return count;
15        
16    }
17}