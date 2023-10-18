public class Static {
    public static void main(String[] args){

        demo.dup1();

        demo d=new demo();
        d.dup2();

    }


}
class demo{
    static int a,b,c;

    int x,y,z;
      static{
          a=1;
          b=11;
          c=111;
      }

    {
         x=9;
        y=99;
        z=999;
    }
    static void dup1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    void dup2(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
          System.out.println(x);
          System.out.println(y);
          System.out.println(z);
    }

}
