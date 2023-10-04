/*
In this we are storing 3 class student's marks

 */

import java.util.Scanner;
public class twoDarrays {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        int arr[][]  = new int[3][3];
        System.out.println(arr.length);

        for(int i=0;i<=arr.length-1;i++){

            for(int j=0;j<=arr[i].length-1;j++){
                System.out.println("enter the marks of the class "+i+" student "+j);
                arr[i][j]=obj.nextInt();
            }

        }for(int i=0;i<=arr.length-1;i++) {

            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("the Stored marks of the class " + i + " student " + j);
                System.out.println(arr[i][j]);

            }

        }
    }
}
