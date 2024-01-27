//input 8572
//output 4

/*
input=anshul
output=6
 */

import java.util.Scanner;

public class hDigit {
    static int digit(int n){
        int count=1;
        while(n>1){
            n=n/10;
            count++;
        } return count;
    }

    static int charInString(String s){
        int count=s.length();

        return count;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the String");
//        int n=obj.nextInt();
        String s= obj.nextLine();
//        System.out.println(digit( n));
        System.out.println(charInString(s));

    }
}
