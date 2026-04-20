// Last updated: 20/04/2026, 22:47:54
1class Solution {
2    public int earliestFullBloom(int[] plantTime, int[] growTime) {
3        int[][] plants= new int[plantTime.length][2];
4        for(int i=0;i<plantTime.length;i++){
5            plants[i][0]=plantTime[i];
6            plants[i][1]=growTime[i];
7        }
8        Arrays.sort(plants, (a, b) -> Integer.compare(b[1], a[1]));
9        int cur=0;
10        int total=0;
11        for(int[] p:plants){
12            cur+=p[0];
13            total=Math.max(total,cur+p[1]);
14        }
15        return total;
16    }
17}