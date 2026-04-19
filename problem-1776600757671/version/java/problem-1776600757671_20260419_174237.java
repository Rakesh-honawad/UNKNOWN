// Last updated: 19/04/2026, 17:42:37
1class Solution {
2    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
3        List<int[]> res= new ArrayList<>();
4        int i=0;
5        int j=0;
6        while(i<firstList.length && j<secondList.length){
7            int start= Math.max(firstList[i][0],secondList[j][0]);
8            int end=Math.min(firstList[i][1],secondList[j][1]);
9            if(start<=end){
10                res.add(new int[]{start,end});
11            }
12            if(firstList[i][1]<secondList[j][1]){
13                i++;
14            }
15            else{
16                j++;
17            }
18
19
20        }
21        return res.toArray(new int[res.size()][]);
22    }
23}