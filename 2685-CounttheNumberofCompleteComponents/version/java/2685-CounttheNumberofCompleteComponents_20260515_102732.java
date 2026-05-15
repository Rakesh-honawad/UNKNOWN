// Last updated: 15/05/2026, 10:27:32
1class Solution {
2
3    public int[] findOrder(int numCourses,
4                           int[][] prerequisites) {
5
6        List<List<Integer>> graph =
7            new ArrayList<>();
8
9        for(int i = 0; i < numCourses; i++){
10            graph.add(new ArrayList<>());
11        }
12
13        // build graph
14        for(int[] p : prerequisites){
15
16            int course = p[0];
17            int pre = p[1];
18
19            graph.get(pre).add(course);
20        }
21
22        boolean[] visited =
23            new boolean[numCourses];
24
25        boolean[] pathVisited =
26            new boolean[numCourses];
27
28        Stack<Integer> stack =
29            new Stack<>();
30
31        // run dfs for all nodes
32        for(int i = 0; i < numCourses; i++){
33
34            if(!visited[i]){
35
36                // cycle found
37                if(dfs(graph,
38                       i,
39                       visited,
40                       pathVisited,
41                       stack)){
42
43                    return new int[0];
44                }
45            }
46        }
47
48        int[] ans = new int[numCourses];
49
50        int index = 0;
51
52        while(!stack.isEmpty()){
53
54            ans[index++] = stack.pop();
55        }
56
57        return ans;
58    }
59
60    private boolean dfs(List<List<Integer>> graph,
61                        int node,
62                        boolean[] visited,
63                        boolean[] pathVisited,
64                        Stack<Integer> stack){
65
66        visited[node] = true;
67        pathVisited[node] = true;
68
69        for(int nei : graph.get(node)){
70
71            // cycle
72            if(pathVisited[nei]){
73                return true;
74            }
75
76            if(!visited[nei]){
77
78                if(dfs(graph,
79                       nei,
80                       visited,
81                       pathVisited,
82                       stack)){
83
84                    return true;
85                }
86            }
87        }
88
89        pathVisited[node] = false;
90
91        stack.push(node);
92
93        return false;
94    }
95}