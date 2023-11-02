/*1111
2222
3333
4444

 */

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
//        Scanner obj=new Scanner(System.in);
//
//
//        System.out.println("enter the number of rows's");
//        int n = obj.nextInt();
//
//
//        for(int i=1; i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(i);
//            }System.out.println(" ");
//        }

        // System.out.Println("enter the length of an array");
        System.out.println("enter the length of array");
        Scanner n =new Scanner(System.in);
        int a =n.nextInt();
        int[] arr=new int[a];
        int sum =0;

        for (int i=0;i<=arr.length-1;i++){
            System.out.println("enter the value of arr"+i);
            int b=n.nextInt();
            arr[i]=b;

//            System.out.println(b);

            sum=sum+b;




        } System.out.println(sum);

    }

}