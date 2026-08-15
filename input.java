import java.util.*;
class input{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String pin=sc.next();
        sc.nextLine(); //3.faltu ka input diya hai taki enter ko input na le
        String firstname=sc.nextLine();//1.next line ke pehle koi bhi int type input liya toh galat hoga kyuki firstname mea pin lelega or seedha last line print hogi
        String lastname=sc.nextLine();//2.next line enter ko bhi as a input maangta
        String address=sc.nextLine();
        System.out.println(pin);
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(address);
    }
}