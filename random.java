package src;
import java.util.*;
class random{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq=new int[128]; //0to127 all keys of keyboard
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        for (int i=0;i<128;i++){
            if(freq[i]>0){
                System.out.println((char)i+":"+freq[i]);
            }
        }
    }
}
/*        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);;
        }
        2 way
        char[] arr=s.toCharArray();
        for(int  i=0;i<arr.length;i++){     //i=0;i<s.length();i++
*/