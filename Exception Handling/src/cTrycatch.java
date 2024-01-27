import java.util.Scanner;

class Demo1{
    void fun1() throws ArithmeticException // ye throws hai
     {
        System.out.println("connection done");
        Scanner obj= new Scanner(System.in);
     try {


         System.out.println("enter the number");
         int a = obj.nextInt();
         int b = obj.nextInt();
     int c = a / b;
         System.out.println(c); }
     catch (Exception e){
         System.out.println("invalid");
         throw e; //ismai jo likhoge voi e mai print hoga
     }

     System.out.println("connection terminated");
    }


}
public class cTrycatch {
    public static void main(String[] args) {
        //bank atm wrong pass example
        try {


            demo1 d1 = new demo1();
            d1.fun1();
        }catch (Exception e){
            System.out.println("invalid");
        }
    }
}
