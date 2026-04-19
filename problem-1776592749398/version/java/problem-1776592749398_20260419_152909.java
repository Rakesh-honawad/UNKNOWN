// Last updated: 19/04/2026, 15:29:09
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals, (a,b)->Integer.compare(a[1],b[1]));
4
5        List<int[]> res=new ArrayList<>();
6        int count=0;
7        int[] cur=intervals[0];
8        for(int i=1;i<intervals.length;i++){
9            if(intervals[i][0]<cur[1]){
10                count++;
11            }
12            else{
13                cur=intervals[i];
14            }
15        }
16      
17        return count;
18        
19    }
20}