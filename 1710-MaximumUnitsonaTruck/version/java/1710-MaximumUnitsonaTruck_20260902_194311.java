// Last updated: 02/09/2026, 19:43:11
1class Solution {
2    public int maximumUnits(int[][] boxTypes, int truckSize) {
3        Arrays.sort(boxTypes, (a,b)->b[1]-a[1]);
4    	int units=0;
5
6        for(int[] b:boxTypes){
7            int boxes=b[0];
8            int unitsperbox=b[1];
9            int take=Math.min(boxes,truckSize);
10            units+=unitsperbox*take;
11            truckSize-=take;
12            if(truckSize==0) break;
13        }
14        return units;
15    }
16}