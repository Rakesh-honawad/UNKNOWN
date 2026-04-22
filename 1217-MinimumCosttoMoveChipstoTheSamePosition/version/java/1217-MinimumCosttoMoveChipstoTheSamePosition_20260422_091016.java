// Last updated: 22/04/2026, 09:10:16
1class Solution {
2    public int minCostToMoveChips(int[] position) {
3        int odd=0;
4        int even=0;
5         for(int i=0;i<position.length;i++){
6            if(position[i]%2==0)even++;
7            else odd++;
8            
9         }
10         return Math.min(even,odd);
11        
12    }
13}