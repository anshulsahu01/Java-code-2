/*
Print

 *****
  *****
   *****
    *****
     *****
     *****
    *****
   *****
  *****
 *****



 */



import java.util.Scanner;

public class fifteen {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the no. of row ");

        int n = obj.nextInt();
        System.out.println(n);


        for(int i=1;i<=n;i++){

            for(int j=1; j<=i; j++){
                System.out.print(" ");

            }
            for(int k=1; k<=5;k++){
                System.out.print("*");

            }
            System.out.println( " ");


        }

        for(int l=n; l>=1;l--){
            for(int m=l; m>=1;m--){
                System.out.print(" ");

            }
            for(int o=1; o<=5; o++){
                System.out.print("*");

            }
            System.out.println(" ");

        }




    }
}
