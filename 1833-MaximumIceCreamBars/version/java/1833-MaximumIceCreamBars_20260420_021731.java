// Last updated: 20/04/2026, 02:17:31
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        int i=0;
4        int count=0;
5        Arrays.sort(costs);
6        while(i<costs.length){
7            if(costs[i]> coins) break;
8            else{
9                coins-=costs[i];
10                i++;
11                count++;
12            }
13           
14        }
15        
16        return count;
17    }
18}