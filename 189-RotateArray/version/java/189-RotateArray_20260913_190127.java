// Last updated: 13/09/2026, 19:01:27
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
19        int n= nums.length;
20        k%=n;
21        if(k<0)k+=n;
22        rev(nums, 0, n-1);
23        rev(nums,0,k-1);
24        rev(nums,k,n-1);     
25    }
26     void rev(int[] nums, int left, int right){
27        while(left<right){
28            int temp=nums[left];
29            nums[left]=nums[right];
30            nums[right]=temp;
31            right--;
32            left++;
33        }
34     }
35}