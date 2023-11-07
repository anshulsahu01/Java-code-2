//First reversed String program


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);


        System.out.println("enter a string ");

//        String a="hey raja";
//        System.out.println(a);
//     char b= a.charAt(0);
//     char c= a.charAt(2);
//     char d= a.charAt(3);
//     char e= a.charAt(4);
//     char f= a.charAt(5);
//
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);


        String s=obj.nextLine();
        String res ="";
        System.out.println(s);
        for(int i=s.length()-1;i>=0;i--){

            res = res+s.charAt(i);

        }
        System.out.println("the reversed string is "+res);


    }
}