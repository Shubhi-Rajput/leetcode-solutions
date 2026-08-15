package src;
import java.util.*;
import java.util.Arrays;
public class insert {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr=Arrays.copyOf(arr,arr.length+1);
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=arr[i-1];
        }
        int value=sc.nextInt();
        arr[0]=value;
        System.out.print(Arrays.toString(arr));
    }
}