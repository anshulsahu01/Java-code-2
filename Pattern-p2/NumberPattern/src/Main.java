/*1111
2222
3333
4444

 */

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);


        System.out.println("enter the number of rows's");
        int n = obj.nextInt();


        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i);
            }System.out.println(" ");
        }
    }

}