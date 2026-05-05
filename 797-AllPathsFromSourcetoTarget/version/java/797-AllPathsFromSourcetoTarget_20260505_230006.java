// Last updated: 05/05/2026, 23:00:06
1class Solution {
2
3    public boolean canFinish(int numCourses, int[][] prerequisites) {
4
5        // build graph
6        List<List<Integer>> graph = new ArrayList<>();
7        for (int i = 0; i < numCourses; i++) {
8            graph.add(new ArrayList<>());
9        }
10
11        for (int[] p : prerequisites) {
12            graph.get(p[1]).add(p[0]);
13        }
14
15        int[] visited = new int[numCourses]; // 0=unvisited, 1=visiting, 2=done
16
17        // check each node
18        for (int i = 0; i < numCourses; i++) {
19            if (visited[i] == 0) {
20                if (dfs(i, graph, visited)) return false; // cycle found
21            }
22        }
23
24        return true;
25    }
26
27    private boolean dfs(int node, List<List<Integer>> graph, int[] visited) {
28        visited[node] = 1; // visiting
29
30        for (int nei : graph.get(node)) {
31            if (visited[nei] == 1) return true; // cycle
32            if (visited[nei] == 0 && dfs(nei, graph, visited)) return true;
33        }
34
35        visited[node] = 2; // done
36        return false;
37    }
38}