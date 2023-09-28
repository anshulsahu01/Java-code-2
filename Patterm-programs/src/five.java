//print
//******
//*****
//****
//***
//**
//*
/*
Print
*
**
***
****
*****
 */

import java.util.Scanner;

public class five {
    public static void main(String[] args) {


        Scanner obj = new Scanner(System.in);

        System.out.println("enter the number");
        int num = obj.nextInt();
        System.out.println( num);


        for(int i =1 ; i<=num; i++){
//
            for(int j =1; j<=i;j++){
                System.out.print("*");

            }



            System.out.println();
        }
    }
}
