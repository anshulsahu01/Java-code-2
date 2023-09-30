import java.util.Scanner;

public class aProgram {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no. of row");
        int num = obj.nextInt();

//
//        for (int i = 1; i <= num; i++) {
//            for (int j = 5; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//
//            }
//            for (int l = 1; l <= i-1; l++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");


            for (int m = 1; m <= num; m++) {

                for (int j = 1; j <= m; j++) {
                    System.out.print(" ");


                }
                for (int o = 5; o >= m; o--) {
                    System.out.print("*");

                }
                for (int p = 5; p >= m; p--) {
                    System.out.print("*");

                }
                System.out.println(" ");

            }
        }
    }

//}