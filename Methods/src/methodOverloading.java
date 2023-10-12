package Methods.src;

public class methodOverloading {
    public static void main(String args[]){

        int a=10;
        float b=20;
        Calculater2 c=new Calculater2();
        c.add(a,b);

//      System.out.print();

    }
}
class Calculater2{

     void  add(int x, float y){


        System.out.println(x+y);


    }
//
//    float  add(int x, float y){
//        return x+y;
//
//
//    }

}
