// Last updated: 15/05/2026, 09:10:35
1class Solution {
2
3    public int maximalNetworkRank(int n, int[][] roads) {
4
5        List<List<Integer>> graph =
6            new ArrayList<>();
7
8        for(int i = 0; i < n; i++){
9            graph.add(new ArrayList<>());
10        }
11
12        // build graph
13        for(int[] r : roads){
14
15            int u = r[0];
16            int v = r[1];
17
18            graph.get(u).add(v);
19            graph.get(v).add(u);
20        }
21
22        int ans = 0;
23
24        for(int i = 0; i < n; i++){
25
26            for(int j = i + 1; j < n; j++){
27
28                int rank =
29                    graph.get(i).size()
30                  + graph.get(j).size();
31
32                // directly connected
33                if(graph.get(i).contains(j)){
34                    rank--;
35                }
36
37                ans = Math.max(ans, rank);
38            }
39        }
40
41        return ans;
42    }
43}