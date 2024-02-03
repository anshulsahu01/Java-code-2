//for finding LCM

import java.util.Scanner;

public class cLCM {
    static int LCM(int a,int b){
        int res =Math.max( a, b);
        while(true){
            if(res% a==0 && res%b==0){
                break;
            }res++;
        }return res;
    }
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = ob.nextInt();
        int b = ob.nextInt();
        System.out.println(LCM(a,b));
    }
}
