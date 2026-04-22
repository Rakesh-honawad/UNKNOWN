// Last updated: 23/04/2026, 01:08:51
1class Solution {
2    public int minIncrementForUnique(int[] nums) {
3        int[] freq= new int[101001];
4        for(int t:nums){
5            freq[t]++;
6        }
7        int moves=0;
8        for(int i=0;i<freq.length-1;i++){
9            if(freq[i]<=1)continue;
10            int ele=freq[i]-1;
11            moves+=ele;
12            freq[i+1]+=ele;    
13        }
14        return moves;
15
16    }
17}