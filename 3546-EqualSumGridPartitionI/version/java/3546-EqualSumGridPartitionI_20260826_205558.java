// Last updated: 26/08/2026, 20:55:58
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        HashMap<Integer,Integer>mp = new HashMap<>();
4        
5        mp.put(0,1);
6        int count=0;
7        int sum=0;
8        for(int i=0;i<nums.length;i++){
9            sum+=nums[i]%2;
10            if(mp.containsKey(sum-k)){
11                count+=mp.get(sum-k);
12            }
13            mp.put(sum,mp.getOrDefault(sum,0)+1);
14
15        }
16        return count;
17    }
18}