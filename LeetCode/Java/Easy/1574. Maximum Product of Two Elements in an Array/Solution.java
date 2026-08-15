class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int FirstMax=nums[nums.length-1];
        int SecondMax=nums[nums.length-2];
        int result = ((FirstMax-1)*(SecondMax-1));
        return result;
    }
}