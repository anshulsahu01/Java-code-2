import java.util.Scanner;

public class AddTwoNumber {
    static int div(int a,int b){
        int ans=a/b;
        return ans;

    }
    public static void main(String[] args) {


        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number a ");
        int a = obj.nextInt();
        System.out.println("enter the number b ");
        int b = obj.nextInt();
//        System.out.println( div(a,b));
        try {
            int ans = a / b;
            System.out.println(ans);
        }
//    catch (Exception e){//user defind exceptional handler
//        System.out.println("concetion terminated"+e);
//    }
//

        catch( ArithmeticException A){
            System.out.println("enter a demominator" );
        }
        catch (NegativeArraySizeException B){
            System.out.println("size is in negative");
        }

    }
}
