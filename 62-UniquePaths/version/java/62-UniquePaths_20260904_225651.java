// Last updated: 04/09/2026, 22:56:51
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][] dp = new int[m][n];
4        for(int[] d : dp) {
5            Arrays.fill(d, -1);
6        }
7        return helper(0, 0, m, n, dp);
8    }
9    
10    private int helper(int i, int j, int m, int n, int[][] dp) {
11        // Base cases
12        if(i >= m || j >= n) return 0;
13        if(i == m - 1 && j == n - 1) return 1;  // Reached destination
14        
15        // Check memo
16        if(dp[i][j] != -1) return dp[i][j];
17        
18        // Recur: go right or go down
19        int right = helper(i, j + 1, m, n, dp);
20        int down = helper(i + 1, j, m, n, dp);
21        
22        // Store and return
23        return dp[i][j] = right + down;
24    }
25}