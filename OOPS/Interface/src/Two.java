//second code of interface 

import java.util.Scanner;
interface Mycalci{

    void mul();
    void div();

}
class calci1 implements Mycalci{

    public void mul(){
        int a = 20;
        int b =10;
        int c = a*b;
        System.out.println("the multi of a&b is "+c);

    }   public void div(){
        int a = 20;
        int b =10;
        int c = a/b;
        System.out.println("the div of a&b is "+c);

    }
}
class calci2 implements Mycalci{
    Scanner n=new Scanner(System.in);

    public void mul(){
        System.out.println("enter the number for a");
        int a = n.nextInt();
        System.out.println("enter the number for b");
        int b =n.nextInt();

        int c = a*b;
        System.out.println("the multi of a&b is "+c);

    }   public void div(){
        System.out.println("enter the number for a");
        int a = n.nextInt();
        System.out.println("enter the number for b");
        int b =n.nextInt();
        int c = a/b;
        System.out.println("the divition of a&b is"+c);

    }
}
class calci3 implements Mycalci{
    Scanner n=new Scanner(System.in);

    public void mul(){


        System.out.println("enter the number for a");
        int a = n.nextInt();
        System.out.println("enter the number for b");
        int b =n.nextInt();
        if(a==0&&b==0){
            System.out.printf("the numbe is 0 can't multiply");
        }else {
            int c = a * b;
            System.out.println("the multi of a&b is " + c);
        }
    }   public void div(){
        System.out.println("enter the number for a");
        int a = n.nextInt();
        System.out.println("enter the number for b");
        int b =n.nextInt();
        if(a==0&&b==0){
            System.out.printf("the numbe is 0 can't multiply");
        }else {
            int c = a / b;
            System.out.println("the multi of a&b is " + c);
        }


    }
}


public class Two {

    public static void main(String[]args){

        calci1 c1 = new calci1();
        calci2 c2 = new calci2();
        calci3 c3 = new calci3();

        c1.mul();
        c1.div();
        c2.mul();
        c2.div();
        c3.mul();
        c3.div();

    }
}
