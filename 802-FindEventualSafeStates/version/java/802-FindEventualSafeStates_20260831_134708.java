// Last updated: 31/08/2026, 13:47:08
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        int n=graph.length;
4        int[] vis= new int[n];
5        List<Integer>res= new ArrayList<>();
6        for(int i=0;i<n;i++){
7            if(!dfs(i, vis, graph)){
8                res.add(i);
9            }
10        }
11        return res;
12    }
13     boolean dfs(int node, int[] vis, int[][] grp){
14         if(vis[node]==2){
15            return false;
16         }
17         if(vis[node]==1)return true;
18         vis[node]=1;
19         for(int neig:grp[node]){
20            if(dfs(neig,vis,grp)){
21                return true;
22            }
23         }
24         vis[node]=2;
25         return false;
26     }
27}