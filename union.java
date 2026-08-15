package src;
import java.util.*;

class union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] ar1 = new int[n];
        int[] ar2 = new int[m];

        for (int i = 0; i < n; i++) {
            ar1[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            ar2[i] = sc.nextInt();
        }

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        int[] dummy = new int[ar1.length + ar2.length];

        int i = 0, j = 0, p = 0;

        while (i < ar1.length && j < ar2.length) {

            if (ar1[i] < ar2[j]) {
                dummy[p] = ar1[i];
                i++;
                p++;
            }

            else if (ar1[i] > ar2[j]) {
                dummy[p] = ar2[j];
                j++;
                p++;
            }

            else {
                dummy[p] = ar1[i];
                i++;
                j++;
                p++;
            }
        }

        while (i < ar1.length) {
            dummy[p] = ar1[i];
            i++;
            p++;
        }

        while (j < ar2.length) {
            dummy[p] = ar2[j];
            j++;
            p++;
        }

        System.out.println(Arrays.toString(Arrays.copyOf(dummy, p)));
    }
}
/*package src;
import java.util.*;
class union{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []ar1=new int[n];
        int []ar2=new int[m];
        for(int i=0;i<n;i++){
            ar1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            ar2[i]=sc.nextInt();
        }
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        int dummy=new int[ar1.length+ar2.length];
        int i=0,j=0,p=0;
        while(i<ar1.length && j<ar2.length){
            if(ar1[i]<ar2[j]){
                dummy[p]=ar1[i];
                i++;
                p++;
            }else if(ar1[i]>ar2[j]){
                dummy[p]=ar2[j];
                j++;
                p++;
            }
            else {
                dummy[p] = ar1[i];
                i++;
                p++;
                dummy[p] = ar2[j];
                j++;
                p++;
            }
        }
        while(i<ar1.length){
            dummy[p]=ar1[i];
            i++;
            p++;
        }
        while(j<ar2.length){
            dummy[p]=ar2[j];
            j++;
            p++;
        }
        System.out.println(Arrays.toString(dummy));
    }
}
*/