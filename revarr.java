import java.util.Arrays;
import java.util.Scanner;

public class revarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        int[] arr=new int[10];
        int left=arr[0];
        int right=arr.length;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int i=*/
//type2        int n = sc.nextInt();
/*        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr1=new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]=arr[n-1-i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
*/
        //
        int[] ar = {1, 2, 3, 4, 5};
        for (int i = 0; i < ar.length - 1; i++) {
            int temp = ar[i];
            ar[i] = ar[i + 1];
            ar[i + 1] = temp;
        }
    }
}