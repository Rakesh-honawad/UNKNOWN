// Last updated: 14/09/2026, 20:09:50
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        Set<List<Integer>>res= new HashSet<>();
5        
6        for(int i=0;i<nums.length-2;i++){
7            int low=i+1;
8            int high=nums.length-1;
9             while(low<high){
10                int sum=nums[i]+nums[low]+nums[high];
11                if(sum==0){
12                    List<Integer>curr= new ArrayList<>();
13                    curr.add(nums[i]);
14                    curr.add(nums[low]);
15                    curr.add(nums[high]);
16
17                    res.add(curr);
18                    low++;
19                }
20                else if(sum<0){
21                    low++;
22                }else{
23                    high--;
24                }
25             }
26        }
27        return new ArrayList<>(res);
28        
29    }
30}