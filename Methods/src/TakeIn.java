//Take something return something

package Methods.src;

public class TakeIn {
    public static void main(String args[]){

        int a=10,b=20;
        call c =new call();

        c.add(a,b);
        int d =c.add(a,b);
        System.out.println(d);

    }


}
class call{
    int add(int x,int y){
        int c = x+y;
        return c;
    }
}

