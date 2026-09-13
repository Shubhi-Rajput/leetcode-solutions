class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        // Count frequency of each number
        for (int num : nums) {
            freq[num]++;
        }
        // Find maximum frequency
        int max = 0;
        for (int i = 0; i < freq.length; i++) {
            max = Math.max(max, freq[i]);
        }
        // Count all elements having maximum frequency
        int ans = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == max) {
                ans += freq[i];
            }
        }
        return ans;
    }
}