// Last updated: 20/04/2026, 18:21:13
1class Solution {
2    public int twoCitySchedCost(int[][] costs) {
3        int sum=0;
4        Arrays.sort(costs, (a,b)->(a[0]-a[1])-(b[0]-b[1]));
5        int n=costs.length/2;
6        for(int i=0;i<n;i++){
7            sum+=costs[i][0];
8        } 
9        for(int i=n;i<2*n;i++){
10            sum+=costs[i][1];
11        }
12        return sum;
13
14        
15    }
16} 