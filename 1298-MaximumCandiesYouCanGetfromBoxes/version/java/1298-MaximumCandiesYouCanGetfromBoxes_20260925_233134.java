// Last updated: 25/09/2026, 23:31:34
1class Solution {
2    public int addDigits(int num) {
3             if(num==0)
4            return 0;
5        if(num%9!=0)
6            return num%9;
7        else
8            return 9;
9    }
10}