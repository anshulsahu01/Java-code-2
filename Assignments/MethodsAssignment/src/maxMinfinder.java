import java.util.Scanner;

public class maxMinfinder {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1= obj.nextInt();
        System.out.println("enter 2nd number");
        int num2= obj.nextInt();
        System.out.println("enter 3rd number");
        int num3= obj.nextInt();


        int Maximum = findmaximum(num1,num2,num3);
     //   int Minimum = findminimum(num1,num2,num3);

        System.out.println(  "maximum is "+Maximum);


    }
    static int findmaximum(int num1,int num2,int num3){
        int max = num1;
       //
        if(num2>max){
            num2=max;

        }if(num3>max){
            num3=max;

        }

        return max;

    }

}
