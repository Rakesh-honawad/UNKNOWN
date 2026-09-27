// Last updated: 27/09/2026, 18:24:45
1class Solution {
2    public int trap(int[] height) {
3         int left=0;
4         int right=height.length-1;
5         int leftmax=0;
6         int rightmax=0;
7         int total=0;
8        while(left<right){
9            if(height[left]<height[right]){
10                if(height[left]>=leftmax){
11                    leftmax=height[left];
12                }
13                else{
14                    total+=leftmax-height[left];
15                }
16                left++;
17            }else{
18                if(height[right]>=rightmax){
19                    rightmax=height[right];
20                }
21                else{
22                    total+=rightmax-height[right];
23                }
24                right--;
25            }
26        }
27        return total;
28    }
29}