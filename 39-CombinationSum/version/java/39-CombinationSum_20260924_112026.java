// Last updated: 24/09/2026, 11:20:26
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> res= new ArrayList<>();
4        List<Integer>ans= new ArrayList<>();
5        helper(candidates, res, ans,0,0,target);
6        return res;
7    }
8    void helper(int[] candidates,List<List<Integer>> res,List<Integer> curr,int sum,int i, int target){
9
10        if(sum==target){
11            res.add(new ArrayList<>(curr));
12            return;
13        }
14        if(sum>target||i>=candidates.length){
15            return;
16        }
17        curr.add(candidates[i]);
18        helper(candidates,res,curr,sum+candidates[i],i,target);
19        curr.remove(curr.size()-1);
20        helper(candidates,res,curr,sum,i+1,target);
21
22    }
23
24}