package src;
import java.util.*;
class binarysearch{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int target = sc.nextInt();
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    System.out.println(mid);
                    return;
                }
                else if (arr[mid] > target) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }

            System.out.println(-1);
        }
    }

/*    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int left=arr[0];
    int right=arr.length-1;
    while(left<=right){
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            System.out.println(mid);
        } else if (arr[mid] > target) {
            right = mid - 1;
        } else if (arr[mid] < target) {
            left = mid + 1;
        }
    }

    }
}*/