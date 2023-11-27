/*
factorial
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){

        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number for factorial");
//        int f=1;

        int n1=obj.nextInt();
        for(int i=n1-1;i>=1;i--){

            n1=n1*i;

//            System.out.println(n1);
        }System.out.println(n1);

    }
}
