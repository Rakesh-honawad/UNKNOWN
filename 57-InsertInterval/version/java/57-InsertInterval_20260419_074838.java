// Last updated: 19/04/2026, 07:48:38
1class Solution {
2    public int[][] insert(int[][] intervals, int[] next) {
3        List<int[]> res= new ArrayList<>();
4        for(int[] curr:intervals){
5            if(curr[1]<next[0]){
6                 res.add(curr);
7
8            }
9            else if(curr[0]>next[1]){
10                res.add(next);
11                next=curr;
12            }
13            else{
14                next[0]=Math.min(next[0],curr[0]);
15                next[1]=Math.max(next[1],curr[1]);
16            }
17        }
18        res.add(next);
19        return res.toArray(new int[res.size()][]);
20    }
21}