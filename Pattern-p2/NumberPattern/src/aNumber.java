/*
12345
12345
12345
12345
12345
 */

import java.util.Scanner;

public class aNumber {
    public static void main(String args[]){

        Scanner obj=new Scanner(System.in);


        System.out.println("enter the number of rows's");
        int n = obj.nextInt();


        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }System.out.println(" ");
        }
    }

}
