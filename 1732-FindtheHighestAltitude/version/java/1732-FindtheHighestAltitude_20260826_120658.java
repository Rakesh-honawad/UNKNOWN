// Last updated: 26/08/2026, 12:06:58
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int[] pref=new int[gain.length+1];
4        pref[0]=0;
5        for(int i=1;i<=gain.length;i++){
6            pref[i]=pref[i-1]+gain[i-1];
7        }
8        int max=0;
9        for(int i=1;i<pref.length;i++){
10            if(max<pref[i]){
11                max=pref[i];
12            }
13        }
14        return max;
15        
16    }
17}