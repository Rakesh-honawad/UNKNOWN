// Last updated: 28/09/2026, 16:23:21
1class Solution {
2    public int pivotInteger(int n) {
3        int res= n*(n+1)/2;
4        int sqr=(int)Math.sqrt(res);
5        if(sqr*sqr==res)return sqr;
6        else return -1; 
7
8    }
9}