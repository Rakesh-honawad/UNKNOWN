// Last updated: 24/09/2026, 13:35:08
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<Integer>curr= new ArrayList<>();
4        List<List<Integer>>res= new ArrayList<>();
5        helper(curr,res,n,k,1,0);
6        return res;
7    }
8    void helper(List<Integer>curr,List<List<Integer>>res,int n, int k, int i,int s){
9        if(s==k){
10            res.add(new ArrayList<Integer>(curr));
11            return;
12        }
13        for(int j=i;j<=n;j++){
14            curr.add(j);
15            helper(curr,res,n,k,i=j+1,s+1);
16            curr.remove(curr.size()-1);
17        }
18    }
19
20}