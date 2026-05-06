// Last updated: 07/05/2026, 00:59:28
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5
6    public boolean validPath(int n, int[][] edges, int source, int destination) {
7        List<List<Integer>> graph = new ArrayList<>();
8        
9        // Initialize the graph
10        for (int i = 0; i < n; i++) {
11            graph.add(new ArrayList<>());
12        }
13        
14        // Build the graph
15        for (int[] edge : edges) {
16            int u = edge[0];
17            int v = edge[1];
18            graph.get(u).add(v);
19            graph.get(v).add(u); // Since the graph is undirected
20        }
21        
22        boolean[] visited = new boolean[n];
23        
24        // Perform DFS from the source
25        return dfs(graph, visited, source, destination);
26    }
27
28    private boolean dfs(List<List<Integer>> graph, boolean[] visited, int curr, int dest) {
29        if (curr == dest) {
30            return true; // Found the destination
31        }
32
33        visited[curr] = true; // Mark the current node as visited
34
35        for (int neighbor : graph.get(curr)) {
36            if (!visited[neighbor]) {
37                if (dfs(graph, visited, neighbor, dest)) {
38                    return true; // Found a valid path
39                }
40            }
41        }
42
43        return false; // No valid path found
44    }
45}
46