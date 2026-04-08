// Last updated: 09/04/2026, 00:23:29
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int l=0;
4        int r=numbers.length-1;
5        while(l<r){
6            int sum=numbers[l]+numbers[r];
7            if(sum==target){
8                return new int[] {l+1,r+1};
9            }
10            else if(sum<target){
11                l++;
12
13            }
14            else{
15                r--;
16            }
17           
18        }
19         return new int[]{};
20    }
21}