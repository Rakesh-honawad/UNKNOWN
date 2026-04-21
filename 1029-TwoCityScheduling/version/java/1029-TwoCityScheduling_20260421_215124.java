// Last updated: 21/04/2026, 21:51:24
1class Solution {
2    public int twoCitySchedCost(int[][] costs) {
3        Arrays.sort(costs, (a,b)->(a[0]-a[1])-(b[0]-b[1]));
4        int ct=0;
5        int n =costs.length/2;
6        for(int i=0;i<n;i++){
7           ct+=costs[i][0];
8        }
9        for(int i=n;i<2*n;i++){
10            ct+=costs[i][1];
11        }
12        return ct;
13    }
14}