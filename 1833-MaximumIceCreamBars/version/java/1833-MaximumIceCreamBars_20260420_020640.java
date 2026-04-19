// Last updated: 20/04/2026, 02:06:40
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        Arrays.sort(costs);
4        int count=0;
5        for(int i=0;i<costs.length;i++){
6            if(costs[i]>coins) break;
7            coins-=costs[i];
8            count++;
9        }
10        return count;
11    }
12}