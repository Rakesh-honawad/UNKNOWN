// Last updated: 04/10/2026, 22:12:04
1class Solution {
2    public int hammingWeight(int n) {
3        int count=0;
4        while(n>0){
5            if(n%2==1)count++;
6            n/=2;
7        }
8        return count;
9    }
10}