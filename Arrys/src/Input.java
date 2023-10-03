import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int[] name = {1,2,3,6};
        System.out.println(name[2]);

        int[] arr =new int[5];
        arr[0]=123;
        arr[1]=233;
        arr[2]=231;
        arr[3]=230;
        arr[4]=1230;

        //[123,233,231,230,1230]
        System.out.println(arr.length);
//        System.out.println(arr[3]);

        //Input from user using for loops
         for(int i=0;i< arr.length;i++){
             arr[i]=in.nextInt();
         }
         for(int i=0;i< arr.length;i++){
             System.out.print(arr[i] + " ");
         }


    }
}
