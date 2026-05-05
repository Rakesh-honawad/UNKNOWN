// Last updated: 05/05/2026, 21:20:30
1class Solution {
2    public int findCenter(int[][] edges) {
3      int i[]=edges[0];
4      int j[]=edges[1];
5      return i[0]==j[0]||i[0]==j[1]?i[0]:i[1];       
6        
7    }
8}