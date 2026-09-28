// Last updated: 28/09/2026, 11:36:58
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4        int res=nums[0]+nums[1]+nums[2];
5        for(int i=0;i<nums.length;i++){
6            int left=i+1;
7            int right=nums.length-1;
8            while(left<right){
9                int sum=nums[i]+nums[left]+nums[right];
10                if(Math.abs(target-sum)<Math.abs(target-res)){
11                    res=sum;
12                }
13                if(sum==target)return target;
14                else if(sum<target){
15                    left++;
16                }
17                else right--;
18            }
19        }
20        return res;
21        
22    }
23}