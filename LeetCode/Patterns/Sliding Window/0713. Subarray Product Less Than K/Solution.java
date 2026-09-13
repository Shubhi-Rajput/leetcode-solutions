class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int l = 0;
        int product = 1;
        int count = 0;
        for (int r = 0; r < nums.length; r++) {
            // Add nums[r] to the window
            product *= nums[r];
            // If product becomes >= k,
            // shrink the window from left
            while (product >= k) {
                product /= nums[l];
                l++;
            }
            // Number of valid subarrays ending at r
            count += r - l + 1;
        }
        return count;
    }
}