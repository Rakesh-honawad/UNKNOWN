// Last updated: 22/04/2026, 20:01:23
1class Solution {
2    public int maximumUnits(int[][] boxTypes, int truckSize) {
3        Arrays.sort(boxTypes, (a,b)->b[1]-a[1]);
4        int total=0;
5        for(int[] num:boxTypes){
6            if(truckSize==0) break;
7            int box=num[0];
8            int item=num[1];
9            int curr=Math.min(box,truckSize);
10             total+=curr*item;
11            truckSize-=curr;
12        }
13        return total;
14    }
15}