// Last updated: 23/04/2026, 20:36:08
1class Solution {
2    public int maximumBags(int[] capacity, int[] rocks, int ad) {
3        int count=0;
4        if(capacity.length==0)return 0;
5        int[] r=new int[rocks.length];
6        for(int i=0;i<rocks.length;i++){
7            r[i]=capacity[i]-rocks[i];
8        }
9        Arrays.sort(r);
10        for(int i=0;i<r.length;i++){
11            if(ad>=r[i]){
12                count++;
13                ad-=r[i];
14            }
15            
16        }
17        return count;
18         
19        
20    }
21}