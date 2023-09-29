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
//  sum();
//       int a= sum2();
//        System.out.println(a);
//

//        Parameter
        int sum3= sum3(10,20);
        System.out.println(sum3);

        }static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

        static int sum2(){
            Scanner in = new Scanner(System.in);

            System.out.print("Enter num1 ");
            int num1= in.nextInt();

            System.out.print("Enter num2 ");
            int num2 = in.nextInt();

            int result = num1+num2;
//            System.out.println("the sum of this is "+ result);


            return result; // yaha return aya to uper iska type ayga


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
