// Last updated: 19/04/2026, 16:01:37
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
4        List<int[]> res=new ArrayList<>();
5        int count=0;
6        int[] curr=intervals[0];
7        for(int i=1;i<intervals.length;i++){
8            if(intervals[i][0]<curr[1]){
9                count++;
10            }else{
11                curr=intervals[i];
12            }
13        }
14        return count;
15        
16    }
17}