import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number  ");
        int n = obj.nextInt();
        int a[] =new int[n];

        for(int i=0; i<=n-1;i++){
            a[i]= obj.nextInt();

        }
        System.out.println("the stored elements are");
        for (int i=0;i<=n-1;i++){
            System.out.println(a[i]);

        }
    }
}
