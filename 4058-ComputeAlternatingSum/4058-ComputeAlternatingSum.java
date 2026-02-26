// Last updated: 26/02/2026, 14:03:31
class Solution {
    public int alternatingSum(int[] nums) {
        
        int sum=0;
        int neg=0;
        for(int i=0;i<nums.length;i+=2)
        {
            sum+=nums[i];
        }
        for(int j=1;j<nums.length;j+=2){
            neg+=nums[j];
        }
        return sum-neg;        
    }
}