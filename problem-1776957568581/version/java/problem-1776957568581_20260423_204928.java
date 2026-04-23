// Last updated: 23/04/2026, 20:49:28
1class Solution {
2    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
3        int count=0;
4        int[] diff= new int[rocks.length];
5        for(int i=0;i<rocks.length;i++){
6            diff[i]=capacity[i]-rocks[i];
7        }
8        Arrays.sort(diff);
9        for(int i=0;i<diff.length;i++){
10            if(diff[i]<=additionalRocks){
11                count++;
12                additionalRocks-=diff[i];
13            }
14        }
15        return count;
16
17    }
18}