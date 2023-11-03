import java.util.Scanner;

interface Mycalculater{
    void mul();
    void div();
}
class calculater1 implements Mycalculater {
    public void mul() {
        int a = 10;
        int b = 20;
        int c = a * b;

        System.out.println(c);
    }

    public void div() {
        int a = 10;
        int b = 20;
        int c = b / a;
        System.out.println(c);
    }
}
class calculater2 implements Mycalculater{

    Scanner n=new Scanner(System.in);


    public void  mul(){
        System.out.println(" multi enter the  values of a& b");
        int a =n.nextInt();
        int b =n.nextInt();
        if (a<0&&b==0){
            System.out.println("the number is 0 can't multi");
        }else {

            int c = a * b;

            System.out.println(c);
        }
    } public void  div(){
        System.out.println(" div enter the  values of a& b");
        int a =n.nextInt();
        int b =n.nextInt();
        if (a<0&&b==0){
            System.out.println("the number is 0 can't div");
        }else {
            int c = b / a;
            System.out.println(c);
        }

    }
}

class calculater3 implements Mycalculater{

    Scanner n=new Scanner(System.in);


    public void  mul(){
        System.out.println("multi enter the  values of a& b");
        int a =n.nextInt();
        int b =n.nextInt();
        if (a<0&&b==0){
            System.out.println("the number is 0 can't multi");
        }else {

            int c = a * b;

            System.out.println(c);
        }
    } public void  div(){

        System.out.println("div enter the  values of a& b");
        int a =n.nextInt();
        int b =n.nextInt();
        if (a<0&&b==0){
            System.out.println("the number is 0 can't div");
        }else {
            int c = b / a;
            System.out.println(c);
        }
    }
}





public class Main {
    public static void main(String[] args) {


        calculater3 c3 =new calculater3();
        calculater2 c2 =new calculater2();
        calculater1 c1 =new calculater1();

        c1.mul(); c1.div();
        c2.mul();  c2.div();
        c3.mul();  c3.div();




    }
}