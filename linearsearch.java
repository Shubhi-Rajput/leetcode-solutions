package src;
import java.util.*;
class linearsearch{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            int[] arr = new int[sc.nextInt()];
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
        int target = sc.nextInt();
        int res = -1;
        for(int i = 0;i<arr.length;i++){
                if (arr[i] == target) {
                    res = i;
                    break;
                }
            }
        System.out.println(res);
        }
    }
