// HCF is having n(0) time complexcity which we have to avoid
//


import java.util.Scanner;
import java.util.Stack;




public class bHcfGcd {
    static int HCF(int a, int b) {
        int min = 0;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        for ( int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
              return i;

            }
        }

        return 1;
    }
    static int Euckid(int a,int b){
       while(a!=b) {
           if (a > b) {
               a = a - b;
           } else {
               b = b - a;
           }
       }return a;
    }

    static int optimised(int a,int b){
        while (a!=0&& b!=0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }if(a!=0){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = ob.nextInt();
        int b = ob.nextInt();
//        System.out.println( HCF(a,b ));

//        System.out.println( Euckid(a,b ));

        System.out.println( optimised(a,b ));
    }
}
