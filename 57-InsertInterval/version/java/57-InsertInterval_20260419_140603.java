// Last updated: 19/04/2026, 14:06:03
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3         List<int[]> res=new ArrayList<>();
4         for(int[] cur:intervals){
5            if(cur[1]<newInterval[0]){
6                res.add(cur);
7            }
8            else if(cur[0]>newInterval[1]){
9                res.add(newInterval);
10                newInterval=cur;
11            }
12            else{
13                newInterval[0]=Math.min(newInterval[0],cur[0]);
14                newInterval[1]=Math.max(newInterval[1],cur[1]);
15            }
16         }
17         res.add(newInterval);
18         return res.toArray(new int[res.size()][]);      
19    }
20}