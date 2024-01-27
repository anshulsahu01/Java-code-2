import java.util.Scanner;
class demo1{
    void fun1(){
        System.out.println("enter two numbers");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c =a/b;
        System.out.println(c);

    }
}class demo2{
    void fun2(){
        demo1 d1=new demo1(); d1.fun1();
    }
}class demo3{
    void fun3(){
        demo2 d2 =new demo2(); d2.fun2();

    }
}
public class bGeneric {
    public static void main(String[] args) {
        demo3 d3=new demo3(); d3.fun3();
    }
}
