// Last updated: 09/04/2026, 07:41:00
1class Solution {
2    public int maxContainers(int n, int w, int maxWeight) {
3       return Math.min(n * n, maxWeight / w) ;
4    }
5}