// Last updated: 06/04/2026, 17:21:05
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int i = 0; // Left pointer
4        int curr = 0; // Current sum
5        int min = Integer.MAX_VALUE; // Minimum length found
6
7        for (int j = 0; j < nums.length; j++) { // Right pointer
8            curr += nums[j]; // Expand the window by adding the current number
9            
10            // When current sum is greater than or equal to target, try to shrink the window
11            while (curr >= target) {
12                min = Math.min(min, j - i + 1); // Update min length
13                curr -= nums[i]; // Shrink the window from the left
14                i++; // Move the left pointer to the right
15            }
16        }
17
18        return min == Integer.MAX_VALUE ? 0 : min; // Return 0 if no valid subarray found
19    }
20}
21