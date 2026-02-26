// Last updated: 26/02/2026, 14:29:30
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Set<Integer> s1 =new HashSet<>();
4       for(int num: nums1){
5        s1.add(num);
6       } 
7       Set<Integer> temp =new HashSet<>();
8       for(int num:nums2){
9        if(s1.contains(num)){
10            temp.add(num);
11        }
12       }
13        int [] res = new int [temp.size()];
14        int i=0;
15        for(int t:temp){
16            res[i++]=t;
17
18        }
19       
20       return res;
21    
22
23        
24    }
25}