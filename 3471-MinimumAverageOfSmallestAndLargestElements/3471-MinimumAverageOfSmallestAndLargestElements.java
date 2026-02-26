// Last updated: 26/02/2026, 14:04:09
class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double[] res=new double[nums.length/2];  
        int idx=0;
        int i=0;
        
        int j=nums.length-1;
        while(i<j){
            int min = nums[i];
            int max = nums[j];
            res[idx]= (min+max)/2.0;
            idx++;
            i++;
            j--;
        }  
        Arrays.sort(res);
        return res[0];
    }
}