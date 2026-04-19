// Last updated: 19/04/2026, 15:07:19
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
4        List<int[]> res= new ArrayList<>();
5        int[] cur=intervals[0];
6        for(int i=1;i<intervals.length;i++){
7            if(intervals[i][0]<=cur[1]){
8                cur[0]=Math.min(cur[0],intervals[i][0]);
9                 cur[1]=Math.max(cur[1],intervals[i][1]);
10                
11
12            }else{
13                res.add(cur);
14                cur=intervals[i];
15
16            }
17        }
18        res.add(cur);
19         return res.toArray(new int[res.size()][]);
20    }
21}