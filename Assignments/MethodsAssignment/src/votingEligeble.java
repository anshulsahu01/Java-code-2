/*
 person is eligible to vote if his/her age is greater than or equal to 18.
 Define a method to find out if he/she is eligible to vote.
 */

import java.util.Scanner;

public class votingEligeble {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter your age");
        int age = obj.nextInt();

        if(age>18){
            System.out.println("you are eligible for voting");

        }else {
            System.out.println("you are not eligible for voting");
        }
    }


}
