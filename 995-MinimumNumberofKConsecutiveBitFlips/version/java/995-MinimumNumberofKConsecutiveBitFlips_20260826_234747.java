// Last updated: 26/08/2026, 23:47:47
1class Solution {
2    public boolean carPooling(int[][] trip, int capacity) {
3        int[] ranges= new int[1001];
4        for(int i=0;i<trip.length;i++){
5            int passenger=trip[i][0];
6            int left=trip[i][1];
7            int right=trip[i][2];
8            if(trip[i][0]>capacity)return false;
9            ranges[left]+=passenger;
10            if(right<1000){
11                ranges[right]-=passenger;
12            }
13            
14
15        }
16        for(int i=1;i<=1000;i++){
17            ranges[i]+=ranges[i-1];    
18        }
19        for(int i=1;i<=1000;i++){
20            if(ranges[i]>capacity)return false;
21        }
22        return true;
23        
24    }
25}