import java.util.Scanner;
public class dReversNo {
    public static void main(String args[]){
        System.out.println("enter a number");
        Scanner obj=new Scanner(System.in);
        int num = obj.nextInt();

        int revers=0,rem;
        while(num!=0){
            rem=num%10;
            revers=revers*10+rem;
           num= num/10;


        }System.out.println(revers);
    }
}
