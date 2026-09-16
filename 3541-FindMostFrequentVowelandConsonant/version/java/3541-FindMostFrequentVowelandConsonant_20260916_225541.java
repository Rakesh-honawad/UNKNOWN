// Last updated: 16/09/2026, 22:55:41
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        List<Integer>res=new ArrayList<>();
4        HashSet<Integer>hs= new HashSet<>();
5        int min=Integer.MAX_VALUE;
6        int max=Integer.MIN_VALUE;
7        for(int i=0;i<nums.length;i++){
8            hs.add(nums[i]);
9            if(nums[i]<min)min=nums[i];
10            if(nums[i]>max)max=nums[i];
11        }
12        for(int i=min;i<=max;i++){
13            if(!hs.contains(i)){
14                res.add(i);
15            }
16        }
17        return res;
18    }
19}