// Last updated: 13/09/2026, 19:03:36
1class Solution {
2    public void rotate(int[] nums, int k) {
3        // int n= nums.length;
4        // k = k % n;
5        // int idx=0;
6        //  int[] arr= new int[n];
7        //  for(int i=n-k;i<n;i++){
8        //     arr[idx]=nums[i];
9        //     idx++;
10        //  }
11        //  for(int i=0;i<n-k;i++){
12        //     arr[idx+i]=nums[i];         
13        // }
14        //  for(int i=0;i<arr.length;i++){
15        //     nums[i]=arr[i];
16        
17        //  }
18        
19       k%=nums.length;
20    if(k<0)
21    {
22        k+=nums.length;
23    }
24    rev(nums,0,nums.length-1);
25    rev(nums,0,k-1);
26    rev(nums,k,nums.length-1);
27      
28    }
29    private void rev(int[] nums, int left, int right){
30        while(left<right){
31            int temp=nums[left];
32            nums[left]=nums[right];
33            nums[right]=temp;
34            left++;
35            right--;
36        }
37     }
38}