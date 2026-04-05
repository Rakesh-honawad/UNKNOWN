// Last updated: 05/04/2026, 16:55:32
// easy one
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        // Check if the array is empty
4        if (nums.length == 0) return 0;
5
6        int i = 0; // Pointer for the last unique element
7        int j = 1; // Pointer for the current element
8
9        while (j < nums.length) {
10            // If the current element is different from the last unique element
11            if (nums[i] != nums[j]) {
12                // Move the unique pointer forward
13                i++;
14                // Update the unique position with the new unique element
15                nums[i] = nums[j];
16            }
17            // Move the current pointer forward
18            j++;
19        }
20
21        // Return the length of unique elements
22        return i + 1; // i is index, so length is i + 1
23    }
24}
25