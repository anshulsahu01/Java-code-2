

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("working");
        try{
        Scanner obj=new Scanner(System.in);


        System.out.printf("enter the value of numerator");
            int a=obj.nextInt();


        System.out.printf("enter the value of denominator");

            int b=obj.nextInt();
            int c = a / b;
            System.out.println(c);
        }

        catch(Exception e) {
            System.out.printf("the dividation is  " +e);

        }
        System.out.println("again going");

        }
    }
