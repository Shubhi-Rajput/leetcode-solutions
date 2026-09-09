class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res=new int[code.length];
        int n=code.length;
        if(k==0){
            return res;
        }
        if(k>0){
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=1;j<=k;j++){
                    sum+=code[(i+j)%n];
                }
                res[i]=sum;
            }
        }
        else if(k<0){
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=1;j<=-k;j++){
                    sum+=code[((i-j)+n)%n];
                }
                res[i]=sum;
            }
        }
        return res;
    }
}
/*i%n
n=5,i=0,1,2,3,4,0,1,2,3,4,0
when i%n
i=1;j=2 then 
i+j = 3
3 index is the last so we need to move in circle 
that's why we did %n
so that 3%n==3%3=0
we return back to 0th index

*/