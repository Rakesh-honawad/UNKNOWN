// Last updated: 26/09/2026, 23:09:43
1class Solution {
2    public int trap(int[] height) {
3        int left=0;
4        int right=height.length-1;
5        int leftmx=0;
6        int rightmx=0;
7        int water=0;
8         while(left<right){
9            if(height[left]<height[right]){
10                if(height[left]>=leftmx){
11                    leftmx=height[left];
12                }else{
13                    water+=leftmx-height[left];
14                }
15                left++;
16                
17            }else{
18                if(height[right]>=rightmx){
19                    rightmx=height[right];
20                }else{
21                    water+=rightmx-height[right];
22                }
23                right--;
24            }
25         }
26         return water;
27        
28    }
29}