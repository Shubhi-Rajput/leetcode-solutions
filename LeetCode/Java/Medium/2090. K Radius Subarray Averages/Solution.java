class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] res=new int[nums.length];
        Arrays.fill(res,-1);
        int n=nums.length;
        int left=0;
        int right=0;
        int w=k*2+1;
        if(k==0){
            return nums;
        }
        if(w>n){
            return res;
        }
        long sum=0;
        while(right<w){
            sum+=nums[right];
            right++;
        }
        res[k++]=(int)sum/w;
        while(right<n){
            sum+=nums[right];
            sum-=nums[left];
            res[k++]=(int)sum/w;
            left++;
            right++;
        }
        return res;
    }
}