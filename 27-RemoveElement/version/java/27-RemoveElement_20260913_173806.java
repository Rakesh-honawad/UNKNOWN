// Last updated: 13/09/2026, 17:38:06
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n= nums.length;
4        k = k % n;
5        int idx=0;
6         int[] arr= new int[n];
7         for(int i=n-k;i<n;i++){
8            arr[idx]=nums[i];
9            idx++;
10         }
11         for(int i=0;i<n-k;i++){
12            arr[idx+i]=nums[i];         
13        }
14         for(int i=0;i<arr.length;i++){
15            nums[i]=arr[i];
16         }
17        
18
19        
20    }
21}