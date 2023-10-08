/*
16       15       14       13
12       11       10       9
8       7       6       5
4       3       2       1

 */
import java.util.Scanner;
public class cDecriment {
    public static void main(String args[]){
        Scanner obj =new Scanner(System.in);
        System.out.println("enter the number of row's you want");
        int n=obj.nextInt();

        int c=n*n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(c+"       ");
                c--;
            }System.out.println("");
        }


    }
}
