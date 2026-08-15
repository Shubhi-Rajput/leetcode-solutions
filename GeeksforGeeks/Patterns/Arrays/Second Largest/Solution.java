class Solution {
    public int getSecondLargest(int[] arr) {
        int fmax=-1;
        int smax=-1;
        for(int i=0;i<arr.length;i++){
            if(fmax<arr[i]){
                smax=fmax;
                fmax=arr[i];
            }
            else if(fmax>arr[i] && smax<arr[i]){
                smax=arr[i];
            }
        }
        return smax;
    }
}