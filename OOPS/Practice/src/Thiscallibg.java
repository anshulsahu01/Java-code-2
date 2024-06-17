import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Timer;


// static ko no static mai use kr skte hai but
//non static ko static mai use krne ke liye object creat krna padega
public class Thiscallibg {
    //2nd This method
     int price=125;
    String brand;

    Thiscallibg(int price ,String brand){
        this.brand=brand;
        this.price=price;
        System.out.println("hello");

    }
    Thiscallibg(){
        this(123,"anshul");
        System.out.println(this.brand);
        System.out.println(this.price);
    }
    static void m1(){
        Thiscallibg ff=new Thiscallibg();

        System.out.println(ff.price);
    }

    public static void main(String[] args) {
        Thiscallibg TC1= new Thiscallibg(402, "bca");
        Thiscallibg tc2=new Thiscallibg();
//        System.out.println(price);
        m1();

    }


}
