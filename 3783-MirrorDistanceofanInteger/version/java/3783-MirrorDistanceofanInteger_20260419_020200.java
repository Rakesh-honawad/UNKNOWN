// Last updated: 19/04/2026, 02:02:00
1class Solution {
2    public int mirrorDistance(int n) {
3        int res=0;
4        int curr=n;
5        while(n>0){
6            res=res*10+n%10;
7            n/=10;
8            
9        }
10        return Math.abs(res-curr);
11    }
12}