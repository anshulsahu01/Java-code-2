//input 8572
//output 4

import java.util.Scanner;

public class hDigit {
    static int digit(int n){
        int count=1;
        while(n>1){
            n=n/10;
            count++;
        } return count;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int n=obj.nextInt();
        System.out.println(digit( n));
    }
}
