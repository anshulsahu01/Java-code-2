/*
Print
*       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *


 */

import java.util.Scanner;
public class eCrossProgram {
    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = obj.nextInt();

        for(int i= 0; i<=n-1;i++){
            for(int j=0;j<=n-1;j++){

              if(i==j || i+j==n-1){
                  System.out.print("*");


              }else{
                  System.out.print(" ");
              }


            }System.out.println(" ");
        }


    }

}
