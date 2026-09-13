class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int sum = 0;
                // First window of size k
                for (int i = 0; i < k; i++) {
                    sum += arr[i];
                }
                int maxSum = sum;
                // Slide the window
                for (int i = k; i < arr.length; i++) {
                    sum += arr[i];       // add new element
                    sum -= arr[i - k];   // remove old element
                    maxSum = Math.max(maxSum, sum);
                }
                return maxSum;
    }
}