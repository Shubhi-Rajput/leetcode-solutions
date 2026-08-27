class Solution {
    public int smallestNumber(int n, int t) {
      while (true) {
        int num = n;
        int product = 1;
            while (num > 0) {
                product *= num % 10;
                num /= 10;
            }
            if (product % t == 0) {
                return n;
            }
            n++;
        }
    }
}

 /*     while(x>0){
        prod*= (x%10);
        x/=10;
      }  
      if(prod % t==0){
        return n; 
      }
    }
}*/
       