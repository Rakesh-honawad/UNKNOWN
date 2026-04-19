// Last updated: 19/04/2026, 17:58:07
1class Solution {
2    public int[][] intervalIntersection(int[][] f, int[][] s) {
3        List<int[]> res= new ArrayList<>();
4        int i=0;
5        int j=0;
6        while(i<f.length && j<s.length){
7            int start=Math.max(f[i][0],s[j][0]);
8            int end=Math.min(f[i][1],s[j][1]);
9
10            if(start<=end){
11                res.add(new int[]{start,end});
12            }
13            if(f[i][1]<s[j][1]){
14                i++;
15            }
16            else{
17                j++;
18            }
19
20        }
21        return res.toArray(new int[res.size()][]);
22    }
23}