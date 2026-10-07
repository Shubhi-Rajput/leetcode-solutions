class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        // Slide the window
        for (int i = k; i < nums.length; i++) {
            // Add new element
            sum += nums[i];
            // Remove old element
            sum -= nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        double answer = (double) maxSum / k;
        return answer;
    }
}
/*        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxsum=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];
            maxsum=Math.max(sum,maxsum);
        }
        return (double) maxsum/k;
    }
}*/