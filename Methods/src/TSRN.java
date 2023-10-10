//Take Something return nothing
package Methods.src;

public class TSRN {
    public static void main(String args[]){
        int a=10,b=40;
        call3 i = new call3();
        i.add(a,b);
        


    }
}
class call3{
    void add(int x,int y){
        int c = x+y;
        System.out.print(c);
    }
}
