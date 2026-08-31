// Last updated: 31/08/2026, 14:07:14
1class Solution {
2    boolean dfs(int node, Stack<Integer> st, int[] vis, List<List<Integer>>grp){
3        vis[node]=1;
4        for(int neigh:grp.get(node)){
5            if(vis[neigh]==1)return true;
6            if(vis[neigh]==0 && dfs(neigh, st, vis, grp)){
7                return true;
8            }
9        }
10        vis[node]=2;
11        st.push(node);
12        return false;
13    }
14    public int[] findOrder(int n, int[][] pre) {
15        int[] vis= new int[n];
16        int[] res= new int[n];
17        List<List<Integer>> grp= new ArrayList<>();
18        for(int i=0;i<n;i++){
19            grp.add(new ArrayList<>());
20        }
21        for(int[] p:pre){
22            int u=p[0];
23            int v=p[1];
24            grp.get(v).add(u);
25        }
26        Stack<Integer>st=new Stack<>();
27        for(int i=0;i<n;i++){
28            if(vis[i]==0){
29                if(dfs(i,st, vis, grp)){
30                    return  new int[0];
31                }
32            }
33        }
34        int idx=0;
35        while(!st.isEmpty()){
36            res[idx++]=st.pop();
37        }
38        return res;
39    }
40}