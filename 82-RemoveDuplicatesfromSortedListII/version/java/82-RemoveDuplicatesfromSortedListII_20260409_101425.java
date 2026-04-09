// Last updated: 09/04/2026, 10:14:25
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer, Integer> mp= new HashMap<>();
4        mp.put(0,1);
5        int sum=0;
6        int count=0;
7        for(int num:nums){
8            sum+=num;
9
10            if(mp.containsKey(sum-k)){
11                count+=mp.get(sum-k);
12            }
13            mp.put(sum,mp.getOrDefault(sum,0)+1);
14
15        }
16        return count;
17    }
18}