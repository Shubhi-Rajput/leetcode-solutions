package src;
import java.util.*;
class secondmax{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int fmax=arr[0];
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(fmax<arr[i]){
                smax=fmax;
                fmax=arr[i];
            }
            else if(fmax>arr[i] && smax<arr[i]){
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}
/*    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int smax = Integer.MIN_VALUE;
        for (int i = arr.length-2; i >= 0; i--) {
            if(max != arr[i]) ;
            smax = arr[i];
            break;
        }
        System.out.println(smax);
    }
} */