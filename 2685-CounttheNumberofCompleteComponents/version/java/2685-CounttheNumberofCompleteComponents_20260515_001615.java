// Last updated: 15/05/2026, 00:16:15
1class Solution {
2    public long maximumImportance(int n, int[][] roads) {
3        long[] degree = new long[n];
4
5        // count degree
6        for(int[] r : roads){
7            degree[r[0]]++;
8            degree[r[1]]++;
9        }
10        Arrays.sort(degree);
11        long ans=0;
12        for(int i=0;i<n;i++){
13            ans+=degree[i]*(i+1);
14        }
15        return ans;
16    }
17}