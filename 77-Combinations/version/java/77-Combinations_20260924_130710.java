// Last updated: 24/09/2026, 13:07:10
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> res= new ArrayList<>();
4        List<Integer>curr= new ArrayList<>();
5        helper(1,n,k,curr,res);
6        return res;
7    }
8    void helper(int i,int n,int k, List<Integer>curr,List<List<Integer>> res){
9        
10        if(k==0){
11            res.add(new ArrayList<Integer>(curr));
12            return;
13        }
14        for(int j=i;j<=n;j++){
15            curr.add(j);
16            helper(j+1,n,k-1,curr,res);
17            curr.remove(curr.size()-1);
18        }
19    }
20}