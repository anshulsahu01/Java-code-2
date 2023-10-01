import java.util.Scanner;

public class dSpace {
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int n = obj.nextInt();

        for(int i=1; i<=n;i++){

            for(int j=1;j<=n;j++){

                if(i==1||j==n||j==1||i==n/2){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }
}
