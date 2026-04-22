// Last updated: 23/04/2026, 03:50:53
1class Solution {
2    public int candy(int[] ratings) {
3        int n=ratings.length;
4        int[] cand= new int[n];
5        Arrays.fill(cand,1);
6         for(int i=1;i<n;i++){
7            if(ratings[i]>ratings[i-1]){
8                cand[i]=cand[i-1]+1;
9            }
10         }
11         for(int i=n-2;i>=0;i--){
12            if(ratings[i]>ratings[i+1]){
13                cand[i]=Math.max(cand[i],cand[i+1]+1);
14            }
15         }
16         int sum=0;
17         for(int num:cand)sum+=num;
18
19         return sum;
20
21        
22    }
23}