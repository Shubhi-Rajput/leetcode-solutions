class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] pre=new int[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=Math.max(nums[i],pre[i-1]);
        }
        int suff=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=n-1;i>=0;i--){
            suff=Math.min(suff,nums[i]);
            if(pre[i]-suff<=k){
                ans=i;
            }
        }
        return ans;
    }
}