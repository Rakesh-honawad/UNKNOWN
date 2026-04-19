// Last updated: 20/04/2026, 01:06:51
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int i=0;
6        int j=0;
7        while(i<g.length&&j<s.length){
8            if(g[i]<=s[j]){
9                i++;
10            }
11            j++;
12        }
13        return i;
14    }
15}