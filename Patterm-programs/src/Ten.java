//Print
// **********
//  ********
//   ******
//    ****
//     **

//By taking input


import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the row number");
        int num = obj.nextInt();

        for(int i=1; i<=num; i++){

            for(int j=1; j<=i; j++){
                System.out.print(" ");

            }
            for (int k=num; k>=i; k--){
                System.out.print("*");


            }
            for(int l=num; l>=i;l--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
