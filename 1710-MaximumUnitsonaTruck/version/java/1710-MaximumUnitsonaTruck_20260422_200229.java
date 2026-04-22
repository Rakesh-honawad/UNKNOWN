// Last updated: 22/04/2026, 20:02:29
1class Solution {
2    public int maximumUnits(int[][] boxTypes, int truckSize) {
3        Arrays.sort(boxTypes, (a,b)->Integer.compare(b[1],a[1]));
4
5        int total=0;
6        for(int[] num:boxTypes){
7            if(truckSize==0) break;
8            int box=num[0];
9            int item=num[1];
10            int curr=Math.min(box,truckSize);
11             total+=curr*item;
12            truckSize-=curr;
13        }
14        return total;
15    }
16}