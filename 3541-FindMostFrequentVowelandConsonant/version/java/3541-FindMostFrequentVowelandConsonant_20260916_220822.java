// Last updated: 16/09/2026, 22:08:22
1class Solution {
2    public String reversePrefix(String s, int k) {
3        char[] arr= s.toCharArray();
4        int i=0;
5        int j=k-1;
6        while(i<j){
7            char temp=arr[i];
8            arr[i]=arr[j];
9            arr[j]=temp;
10            i++;j--;
11        }
12        return new String(arr);
13
14        
15    }
16}