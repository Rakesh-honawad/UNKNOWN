// Last updated: 18/09/2026, 00:25:50
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int i=0;int j=0;
6        while(j<s.length&& i<g.length){
7            if(g[i]<=s[j]){
8                i++;
9            }j++;
10        }
11        return i;
12        
13    }
14}