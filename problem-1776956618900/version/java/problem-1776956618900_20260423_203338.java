// Last updated: 23/04/2026, 20:33:38
1class Solution {
2    public int maximumBags(int[] capacity, int[] rocks, int ad) {
3        int count=0;
4        int[] r=new int[rocks.length];
5        for(int i=0;i<rocks.length;i++){
6            r[i]=capacity[i]-rocks[i];
7        }
8        Arrays.sort(r);
9        for(int i=0;i<r.length;i++){
10            if(ad>=r[i]){
11                count++;
12                ad-=r[i];
13            }
14            
15        }
16        return count;
17         
18        
19    }
20}