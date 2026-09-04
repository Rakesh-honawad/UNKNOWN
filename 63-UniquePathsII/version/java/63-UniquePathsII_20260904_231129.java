// Last updated: 04/09/2026, 23:11:29
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int n=obstacleGrid.length;
4        int m=obstacleGrid[0].length;
5        if(obstacleGrid[0][0] == 1 || obstacleGrid[n-1][m-1] == 1) {
6            return 0;
7        }
8        int[][] dp= new int[n][m];
9        for(int[]d:dp){
10            Arrays.fill(d,-1);
11
12        }
13        return helper(0,0,obstacleGrid,dp);
14        
15    }
16     private int helper(int i, int j, int[][] grid, int[][] dp) {
17        int n = grid.length;
18        int m = grid[0].length;
19        
20        // Out of bounds
21        if(i >= n || j >= m) return 0;
22        
23        // Obstacle encountered
24        if(grid[i][j] == 1) return 0;
25        
26        // Reached destination
27        if(i == n - 1 && j == m - 1) return 1;
28        
29        // Check memo
30        if(dp[i][j] != -1) return dp[i][j];
31        
32        // Recur: go down or go right
33        int down = helper(i + 1, j, grid, dp);
34        int right = helper(i, j + 1, grid, dp);
35        
36        return dp[i][j] = down + right;
37    }
38}