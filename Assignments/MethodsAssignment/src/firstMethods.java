import java.util.Scanner;

/*
1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
*/
public class firstMethods {
    public static void main(String[] args) {




        maxnumber();
        mininumber();



    }
    static void mininumber(){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter three number");
        int num1= obj.nextInt();
        int num2= obj.nextInt();
        int num3= obj.nextInt();

        if(num1<num2){
            System.out.println("num1 is minimum");

        } else if (num2<num3) {
            System.out.println("num2 is minimum");

        }else {
            System.out.println("num3 is minimum");
        }


    }    static void maxnumber(){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter three number");
        int num1= obj.nextInt();
        int num2= obj.nextInt();
        int num3= obj.nextInt();
        if (num1>num2){
            System.out.println("num1 is max");

        } else if (num2>num3) {
            System.out.println("num2 is max ");

        }
        else{
            System.out.println("num3 is max");
        }

    }

}
