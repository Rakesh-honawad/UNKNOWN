// Last updated: 15/09/2026, 00:25:31
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int n=grid.length;int m=grid[0].length;
4        int[][] dp= new int[n+1][m+1];
5        for(int[] d:dp){
6            Arrays.fill(d,-1);
7        }
8         return helper(0,0,n,m,grid, dp);
9       
10    }
11    int helper(int i, int j, int n , int m, int[][] grid, int[][] dp){
12        if(i>=n||j>=m)return Integer.MAX_VALUE/2;
13        if(i==n-1 &&j==m-1)return grid[i][j];
14        if(dp[i][j]!=-1)return dp[i][j];
15        int down=helper(i,j+1,n,m,grid,dp);
16        int up=helper(i+1,j,n,m,grid,dp);
17
18        return dp[i][j]=grid[i][j]+Math.min(down,up);
19    }
20}