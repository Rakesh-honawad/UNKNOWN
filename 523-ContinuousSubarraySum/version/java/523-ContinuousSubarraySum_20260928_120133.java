// Last updated: 28/09/2026, 12:01:33
1class Solution {
2    public int trap(int[] height) {
3        int left=0;
4        int right=height.length-1;
5        int total=0;
6        int leftmax=0;
7        int rightmax=0;
8        while(left<right){
9            if(height[left]<height[right]){
10                if(height[left]>leftmax){
11                    leftmax=height[left];
12                }
13                total+=leftmax-height[left];
14                left++;
15            }else{
16                if(height[right]>rightmax){
17                    rightmax=height[right];
18                }
19                total+=rightmax-height[right];
20                right--;
21
22            }
23        }
24        return total;
25    }
26}