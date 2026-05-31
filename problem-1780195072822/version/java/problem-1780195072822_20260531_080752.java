// Last updated: 31/05/2026, 08:07:52
1class Solution {
2    public int digitFrequencyScore(int n) {
3        int[] freq=new int[10];
4        while(n>0){
5            freq[n%10]++;
6            n/=10;
7        }
8        int s=0;
9        for(int i=0;i<=9;i++){
10            s+=i*freq[i];
11        }
12        return s;
13    }
14}