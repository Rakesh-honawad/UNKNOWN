// Last updated: 15/05/2026, 00:17:18
1class Solution {
2    public long maximumImportance(int n, int[][] roads) {
3        if(n<=1)return n;
4        long[] degree = new long[n];
5
6        // count degree
7        for(int[] r : roads){
8            degree[r[0]]++;
9            degree[r[1]]++;
10        }
11        Arrays.sort(degree);
12        long ans=0;
13        for(int i=0;i<n;i++){
14            ans+=degree[i]*(i+1);
15        }
16        return ans;
17    }
18}