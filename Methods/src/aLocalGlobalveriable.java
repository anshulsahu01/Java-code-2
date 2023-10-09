package Methods.src;

public class aLocalGlobalveriable {
    public static void main(String[] args){
        // local varible because it is inside the main

        Demo d1 = new Demo();

        System.out.println(d1.a);
        System.out.println(d1.b);
        System.out.println(d1.c);
        System.out.println(d1.d);


    }

}
class Demo{

    //instance variable
    int a =1;
    float b;
    double c;
    String d;
}
