// Last updated: 15/05/2026, 12:02:25
1class Solution {
2    public int[] findOrder(int n, int[][] pre) {
3        List<List<Integer>> grp= new ArrayList<>();
4        for(int i=0;i<n;i++)grp.add(new ArrayList<>());
5        for(int[] p:pre){
6            int u=p[0],v=p[1];
7            grp.get(v).add(u);
8        }
9        boolean[] visited=new boolean[n];
10        boolean[] path= new boolean[n];
11        Stack<Integer> st= new Stack<>();
12        for(int i=0;i<n;i++){
13            if(!visited[i]){
14                if(dfs(grp,i,path,visited,st)){
15                    return new int[0];
16                }
17            }
18        }
19        int[] res= new int[n];
20        int idx=0;
21        while(!st.isEmpty()){
22            res[idx++]=st.pop();
23        }
24        return res;
25    }
26
27    private boolean dfs(List<List<Integer>> grp,int node, boolean[] path, boolean[] visited, Stack<Integer> st ){
28        visited[node]=true;
29        path[node]=true;
30
31        for(int nie:grp.get(node)){
32            if(path[nie])return true;
33            if(!visited[nie]){
34                if(dfs(grp,nie,path,visited,st)){
35                    return true;
36                }
37            }
38        }
39        path[node]= false;
40        st.push(node);
41        return false;
42
43    }
44        
45    
46}