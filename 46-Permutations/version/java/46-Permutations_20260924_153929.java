// Last updated: 24/09/2026, 15:39:29
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<Integer>curr= new ArrayList<>();
4        List<List<Integer>>res= new ArrayList<>();
5        int n=nums.length;
6        boolean[] vis= new boolean[n];
7        helper(n,nums,curr,res,vis);
8        return res;
9    }
10    void helper( int n, int[] nums, List<Integer>curr, List<List<Integer>>res,boolean[] vis){
11        if(curr.size()==n){
12            res.add(new ArrayList<>(curr));
13            return;
14        }
15        for(int i=0;i<nums.length;i++){
16            if(vis[i])continue;
17            vis[i]=true;
18            curr.add(nums[i]);
19            helper(n,nums,curr, res, vis);
20            curr.remove(curr.size()-1);
21            vis[i]=false;
22        }
23    }
24}