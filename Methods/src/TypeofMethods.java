// No input no-output

package Methods.src;

public class TypeofMethods {
    public static void main(String[] args){
        Calculater c = new Calculater();
        c.add();

    }


}
class Calculater{
    void add(){
        int a =10;
        int b=20;
        int c = a+b;
        System.out.println("the sum of both the number is "+c);
    }

    public static class Takeinput {
    }
}
