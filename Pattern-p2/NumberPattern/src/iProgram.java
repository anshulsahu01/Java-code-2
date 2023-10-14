/*
 11111$
#22222
 33333$
#44444
 55555$
 */

import java.util.Scanner;
public class iProgram {
    public static void main(String args[]){



        Scanner obj = new Scanner(System.in);
        System.out.println("enter the num of rows");
        int num =obj.nextInt();



        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.print("#");
            }else{
                System.out.print(" ");
            }

            for(int j=1;j<=num;j++){
                System.out.print(i);
            }
            if(i%2!=0){
                System.out.print("$");
            }
            System.out.println(" ");
        }



    }
}
