public class NonStatic {

    public static void main(String args[]){

        Nonstatic2 d1=new Nonstatic2();

        d1.demo();
    }
}
class Nonstatic2{
    {
        System.out.println("inside the nonstatic block");
    }
    {
        System.out.println("inside the nonstatic block 2");
    }

   void demo(){
       System.out.println("inside the constuctor");
    }
}


/*
out put

inside the nonstatic block
inside the nonstatic block 2
inside the constuctor

 */