// Last updated: 15/05/2026, 07:45:26
1class Solution {
2    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};// {1,0} row=1 it mean down and {0,1} column =1 it mean move right side from current position
3    public int longestIncreasingPath(int[][] matrix) {
4        int n = matrix.length;
5        int m = matrix[0].length;
6        int ans = 0;
7        int[][] memo = new int[n][m];  //
8
9        for(int i = 0; i < n; i++){
10            for(int j = 0; j < m; j++){  // 
11                ans = Math.max(ans, dfs(matrix, i, j, memo));
12            }
13        }
14        return ans;
15    }
16    
17   private int dfs(int[][] matrix, int r, int c, int[][] memo){  // Fix 3: returns int
18        if(memo[r][c] != 0) return memo[r][c];  // 
19
20        int longest = 0;
21        for(int[] d : dir){
22            int nr = r + d[0]; // next row / next neghbor this will check  neg bour if  matrix[nr][nc] > matrix[r][c]  this condition satisfies it means if negihbour row have greater element then move 
23            int nc = c + d[1];  // this also does same thing but check for the colomns neghbor left or right colomn if it greate the r c={current colnmn} nc={neighbou/next column}
24            if(nr >= 0 && nc >= 0 && nr < matrix.length && nc < matrix[0].length
25               && matrix[nr][nc] > matrix[r][c]){
26                longest = Math.max(longest, dfs(matrix, nr, nc, memo));  // this we need tbescause the answer anted longest path 
27            }
28        }
29
30        memo[r][c] = 1 + longest;  //  longest weill storre path from the next elemnt i mean neighbor nr/nc it dont add up the current node so we add it explicitely
31        return memo[r][c];
32    }
33}