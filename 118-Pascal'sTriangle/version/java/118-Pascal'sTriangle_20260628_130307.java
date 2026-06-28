// Last updated: 28/06/2026, 13:03:07
1class Solution {
2    public int hammingDistance(int x, int y) {
3        int number =x^y;
4        int count = Integer.bitCount(number);
5        return count;
6
7    }
8}