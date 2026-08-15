import java.util.Scanner;
import java.util.*;
class divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int n = sc.nextInt();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);    //list.add(n/i);
                System.out.println(list);
            }
        }
    }
}
