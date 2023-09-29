package Methods.src;

import java.util.Scanner;

public class first {
     /*
    return_type name (){
    //body

    return statement
    }
     */


    public static void main(String[] args) {

        sum();


        sum();
        }
    static void sum(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1 ");
        int num1= in.nextInt();

        System.out.print("Enter num2 ");
        int num2 = in.nextInt();

        int result = num1+num2;
        System.out.println("the sum of this is "+ result);

    }

}
