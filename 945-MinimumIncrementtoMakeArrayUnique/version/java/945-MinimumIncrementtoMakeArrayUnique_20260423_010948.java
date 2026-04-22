// Last updated: 23/04/2026, 01:09:48
class Solution {
    public int minIncrementForUnique(int[] nums) {
        int max = Integer.MIN_VALUE;
        int minIncrement = 0;
        for(int n: nums){
            max = Math.max(max,n);
        }

        int[] freq = new int[nums.length + max];
        for(int val: nums){
            freq[val]++;
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] <= 1){
                continue;
            }
            else{
                int duplicates = freq[i] - 1;
                freq[i+1] += duplicates;
                freq[i] = 1;
                minIncrement += duplicates;
            }
        }

        return minIncrement;
        
    }
}