// Diffrence between || and & (or and )


import java.util.Scanner;

public class Thirteen {
    static public void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("enter your age ");

        int age = obj.nextInt();
        System.out.println("Your age is  "+age);

//        if(age>50||age>60){
//            System.out.println("senior ");
//
//
//        }else {
//            System.out.println("below 49");
//        }
//


        if(age>50&age>60){
            System.out.println("senior ");


        }else {
            System.out.println("below 49");
        }

    }
}
