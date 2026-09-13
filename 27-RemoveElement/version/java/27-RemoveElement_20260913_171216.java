// Last updated: 13/09/2026, 17:12:16
1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer,Integer> mp= new HashMap<>();
4        for(int num:nums){
5            mp.put(num, mp.getOrDefault(num,0)+1);
6        }
7        int n=nums.length/2;
8        for(int k:nums){
9            if(mp.get(k)>n){
10                return k;
11            }
12        }
13        return -1;
14        //  Arrays.sort(nums);
15        //  return nums[nums.length/2];
16    }
17}