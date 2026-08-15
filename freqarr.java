/*import java.util.*;
class freqarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] freq = new int[10];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count frequency
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // Print frequency
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + freq[i]);
        }
    }
}*/
//Sir's
package src;
import java.util.*;
class freqarr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Size of array:");
        int[] arr = new int[n];
        System.out.print("Input of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int [] freq=new int[10];
        int num=sc.nextInt();
        while(num>0){
            int d=num%10;
            freq[d]=freq[d]+1;
            num=num/10;
        }
        System.out.println("Enter number to find the frequency of:");
        for (int i=0;i<10;i++) {
        if(freq[i]>0){
            System.out.println(arr[i] + ":" + freq[i]);
            }
        }
    }
}