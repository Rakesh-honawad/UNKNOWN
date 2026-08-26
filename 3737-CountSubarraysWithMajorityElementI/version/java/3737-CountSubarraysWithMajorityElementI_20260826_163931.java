// Last updated: 26/08/2026, 16:39:31
1class Solution {
2    public int longestBalanced(int[] nums) {
3        int res=0;
4        for(int i=0;i<nums.length;i++){
5            HashSet<Integer>even=new HashSet<>();
6            HashSet<Integer>odd= new HashSet<>();
7            for(int j=i;j<nums.length;j++){
8                if(nums[j]%2==0){
9                    even.add(nums[j]);
10                }
11                else{
12                     odd.add(nums[j]);
13                }
14
15                if(even.size()==odd.size()){
16                    res=Math.max(res,j-i+1);
17                }
18            }
19            
20            
21
22            
23        }
24        return res;
25        
26    }
27}