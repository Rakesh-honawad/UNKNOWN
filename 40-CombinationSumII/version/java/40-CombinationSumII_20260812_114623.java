// Last updated: 12/08/2026, 11:46:23
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        Arrays.sort(candidates);
4        List<List<Integer>>res= new ArrayList<>();
5        backtrack(candidates, 0,target, res, new ArrayList<>());
6        return res;
7    }
8     private void backtrack(int[] arr, int strt, int target, List<List<Integer>>res, List<Integer>curr)
9    {
10       if(target<0)return; 
11        if(target==0){
12            res.add(new ArrayList<>(curr));
13            return;
14        }
15        
16       for(int i=strt;i<arr.length;i++){ 
17        
18        if(i>strt &&arr[i]==arr[i-1])continue;
19        if(arr[i]>target)break;
20        curr.add(arr[i]);
21        backtrack(arr,i+1,target-arr[i],res,curr);
22        curr.remove(curr.size()-1);  
23       }    
24    }
25
26}