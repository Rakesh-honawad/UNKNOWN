// Last updated: 23/04/2026, 21:42:44
1class Solution {
2    public int maxCoins(int[] piles) {
3        Arrays.sort(piles);
4        int j=0;
5        for(int i=piles.length/3;i<piles.length;i+=2){
6            j+=piles[i];
7        }
8        return j;
9    }
10}