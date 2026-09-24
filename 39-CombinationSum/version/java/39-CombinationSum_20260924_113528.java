// Last updated: 24/09/2026, 11:35:28
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>>res= new ArrayList<>();
4        List<Integer>curr= new ArrayList<>();
5        helper(0,0,candidates,target,curr,res);
6        return res;
7    }
8    void helper(int i, int sum, int[] arr, int target, List<Integer>curr, List<List<Integer>>res){
9        if(sum==target){
10            res.add(new ArrayList<Integer>(curr));
11            return;
12        }
13        if(i>=arr.length||sum>target){
14            return;
15        }
16        curr.add(arr[i]);
17        helper(i,sum+arr[i],arr,target,curr,res);
18        curr.remove(curr.size()-1);
19        helper(i+1,sum,arr, target,curr,res);
20    }
21}