// Last updated: 19/04/2026, 14:50:28
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));
4        List<int[]> res= new ArrayList<>();
5        int[] current=intervals[0];
6        for(int i=1;i<intervals.length;i++){
7             if (intervals[i][0] <= current[1]) {
8                current[0] = Math.min(current[0], intervals[i][0]);
9                current[1] = Math.max(current[1], intervals[i][1]);
10            } 
11            else {
12                res.add(current);
13                current = intervals[i];
14            }
15        }
16        res.add(current);
17        return res.toArray(new int[res.size()][]);  
18    }
19}