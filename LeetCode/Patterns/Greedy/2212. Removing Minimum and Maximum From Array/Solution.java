class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return n;
        }
        int minidx=0,maxidx=0;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[minidx]){
                minidx=i;
            }
            if(nums[i]>nums[maxidx]){
                maxidx=i;
            }
        }
        int min=Math.min(minidx,maxidx);
        int max=Math.max(maxidx,minidx);
        // 1. Remove both from the left
        int left = max + 1;

        // 2. Remove both from the right
        int right = n - min;

        // 3. Remove min from left and max from right
        int both = (min + 1) + (n - max);

        return Math.min(left, Math.min(right, both));
    }
}