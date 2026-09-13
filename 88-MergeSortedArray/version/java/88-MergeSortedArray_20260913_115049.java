// Last updated: 13/09/2026, 11:50:49
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int mid=m-1;
4        int end=n-1;
5        int fnal=m+n-1;
6        while(end>=0){
7            if(mid>=0 && nums1[mid]>nums2[end]){
8                nums1[fnal]=nums1[mid];
9                mid--;
10            }else{
11                nums1[fnal]=nums2[end];
12                end--;
13            }
14            fnal--;
15        }
16    }
17}