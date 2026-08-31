// Last updated: 31/08/2026, 13:05:50
1class Solution {
2    public boolean canFinish(int n, int[][] pre) {
3        List<List<Integer>>grp= new ArrayList<>();
4        for(int i=0;i<n;i++){
5            grp.add(new ArrayList<>());
6        }
7        for(int[]p:pre){
8            int u=p[0];
9            int v=p[1];
10            grp.get(v).add(u);
11        }
12        int[] vis= new int[n];
13
14        for(int i=0;i<n;i++){
15            if(vis[i]==0){
16                if(dfs(i,vis,grp)){
17                    return false;
18                }
19            }
20        }
21        
22        return true;
23    }
24
25    boolean dfs(int node, int[] vis, List<List<Integer>> grp){
26        vis[node]=1;
27        for(int neig:grp.get(node)){
28            if(vis[neig]==1){
29                return true;
30            }
31            if(vis[neig]==0 && dfs(neig, vis, grp)){
32                return true;
33            }
34
35        }
36        vis[node]=2;
37        return false;
38
39    }
40}