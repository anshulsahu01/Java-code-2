
/*
[Write a program to print the sum of two numbers entered by user by defining your own method.
 */

import java.util.Scanner;
public class addTwoNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number 1 ");

        int a= obj.nextInt();
        System.out.println("enter no 2");
        int b = obj.nextInt();

        add(a,b);


    }
    static void add(int a,int b){
        int sum;
        sum = a+b;
        System.out.println("addition is "+sum);
    }

}

