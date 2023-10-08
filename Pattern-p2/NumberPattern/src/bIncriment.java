import java.util.Scanner;
public class bIncriment {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number of rows you want");
        int n = obj.nextInt();

        int c=1;

        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(c +"      ");
                c++;
            }System.out.println(" ");
        }

    }

}
