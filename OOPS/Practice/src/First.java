public class First {
    String brand;
    int price;

    //no parameter constructor  t2
    First(){
//        System.out.println("hello Constructor");
    }





//    First(String brand, int price)
//    {
//        this.brand=brand;
//        this.price=price;
//    }
//    First(int price,String brand)
//    {
//        this.price=price;
//        this.brand=brand;
//    }
     void details(){
         System.out.println("hello c");


         System.out.println(this.brand); //This we use for accessing  global variables in non-static method
         System.out.println(this.price);

    }

    public static void main(String[] args)
    {
//        First f1=new First();
//        First f1=new First("abc",123);
//        First f2=new First(423,"mnc");
//
        First f3=new First();
        f3.details();


//        f1.details();
//        f2.details();


    }
}

