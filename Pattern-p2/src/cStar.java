import java.util.Scanner;

public class cStar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no. of row");
        int num = obj.nextInt();

        for(int i=1;i<=num;i++){

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
