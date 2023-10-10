//Take nothing return something
package Methods.src;

public class takeNothing {
    public static void main(String args[]){

        call2 d = new call2();
        int out= d.add();
        System.out.print(out);


    }
}
class call2{
    int add(){
        int a=5,b=10,c;
        c=a+b;
        return c;

    }
}

