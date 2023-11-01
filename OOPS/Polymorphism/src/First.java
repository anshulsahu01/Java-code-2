
class Dog{

    void run(){
        System.out.println("fast");
        }


    void eat(){
        System.out.println("meet");
    }
   }



   class Cat extends Dog{
    void eat(){
        System.out.println("milk");
    }

   }
public class First {
    public static void main(String args[]){
        Cat d1=new Cat();
        d1.eat();
        d1.run();
    }


}
