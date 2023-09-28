/*
Print

*****
*   *
*   *
*   *
*****

 */

import java.util.Scanner;

//We can use static in place of public and Write any thing in place of args
public class Twelve {

    static public void main(String[] arnshul){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows you want ");

        int n = obj.nextInt();



        for(int i=1;i<=n;i++ ){

            for (int j=1 ;j<=n;j++){

                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }


            } System.out.println();

        }

//        System.out.print("anshul");
    }
}
