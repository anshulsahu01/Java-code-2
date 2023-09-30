/*
print
     *
    ***
   *****
  *******
 *********
 *********
  *******
   *****
    ***
     *
 */
import java.util.Scanner;

public class bTwo {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no. of row");
        int num = obj.nextInt();


        for (int i = 1; i <= num; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");

            }
            for (int l = 1; l <= i-1; l++) {
                System.out.print("*");
            }
            System.out.println("");



        }  for(int i=1;i<=num;i++){

            for(int j=1;j<=i;j++){
                System.out.print(" ");



            }for(int k=num;k>=i;k--) {
                System.out.print("*");

            }for(int k=num;k>=i+1;k--) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
