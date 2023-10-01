/*
Define a program to find out whether a given number is even or odd
 */
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number");
        int a = obj.nextInt();

        if(a%2==0){
            System.out.println(a+ " is even");
        }else{
            System.out.println(a+ " is odd");
        }
    }
}
