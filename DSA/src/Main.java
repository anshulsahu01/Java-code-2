/*
Linear search
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of an arry");
      int n=obj.nextInt();

        int[] arr=new int[n];
        System.out.println("enter the numbers");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<=arr.length-2;i++){

            for(int j=1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                  int  temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;


                } System.out.println("the linear search of this equation is " + arr[j]);
            }



        }
//        for(int i=0;i<=arr.length-1;i++) {
//
//            System.out.println("the linear search of this equation is " + arr[i]);
//        }
    }
}