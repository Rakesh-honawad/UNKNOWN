// Last updated: 02/09/2026, 15:25:42
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals, (a,b)->a[1]-b[1]);
4        int count=1;
5        int lastend=intervals[0][1];
6        for(int i=1;i<intervals.length;i++){
7            int start=intervals[i][0];
8            int end= intervals[i][1];
9            if(start>=lastend){
10                count++;
11                lastend=end;
12            }
13
14        }
15        return intervals.length-count;
16
17        
18    }
19}