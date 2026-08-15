import java.util.*;
class elebill{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int unit=sc.nextInt();
        float count=0;
        if(unit<=100){
            count=unit;
        }else if(unit<=200){
            count=100+(unit-100)*2;
        }else{
            count=300+(unit-200)*3;
        }
        System.out.printf("%.2f",count);
    }
}