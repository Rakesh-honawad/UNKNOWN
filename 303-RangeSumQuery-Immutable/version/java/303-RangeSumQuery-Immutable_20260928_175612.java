// Last updated: 28/09/2026, 17:56:12
1class NumArray {
2    int[] pref;
3
4    public NumArray(int[] nums) {
5        pref=new int[nums.length];
6        pref[0]=nums[0];
7        for(int i=1;i<nums.length;i++){
8             pref[i]=pref[i-1]+nums[i];
9        }      
10    }
11    
12    public int sumRange(int left, int right) {
13        if(left==0)return pref[right];
14        else return pref[right]-pref[left-1];
15    }
16}
17
18/**
19 * Your NumArray object will be instantiated and called as such:
20 * NumArray obj = new NumArray(nums);
21 * int param_1 = obj.sumRange(left,right);
22 */