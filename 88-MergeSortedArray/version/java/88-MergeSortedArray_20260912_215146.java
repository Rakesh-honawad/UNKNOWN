// Last updated: 12/09/2026, 21:51:46
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int[] arr= new int[m+n];
4        for(int i=0;i<m;i++){
5            arr[i]=nums1[i];
6        }
7        for(int i=0;i<n;i++){
8            arr[m+i]=nums2[i];
9        }
10        for(int i=0;i<m+n;i++){
11            nums1[i]=arr[i];
12        }
13        Arrays.sort(nums1);
14    }
15}