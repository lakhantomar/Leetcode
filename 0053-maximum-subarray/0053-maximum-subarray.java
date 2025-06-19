class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];          // Start with first element
        int current = nums[0];      // Initialize current with first element

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);  // Either start new or extend
            max = Math.max(max, current);                    // Update global max
        }

        return max;
    }
}
