// Last updated: 24/09/2026, 11:24:12
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> res= new ArrayList<>();
4
5        List<Integer>ans= new ArrayList<>();
6        Arrays.sort(candidates);
7        helper(candidates, res, ans,0,0,target);
8        return res;
9    }
10    void helper(int[] candidates,List<List<Integer>> res,List<Integer> curr,int sum,int i, int target){
11
12        if(sum==target){
13            res.add(new ArrayList<>(curr));
14            return;
15        }
16        if(sum>target||i>=candidates.length){
17            return;
18        }
19        curr.add(candidates[i]);
20        helper(candidates,res,curr,sum+candidates[i],i,target);
21        curr.remove(curr.size()-1);
22        helper(candidates,res,curr,sum,i+1,target);
23
24    }
25
26}