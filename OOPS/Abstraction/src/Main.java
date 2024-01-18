//abstraction 01 code

abstract class Animal{
    abstract void   eat();
}
class Dog extends Animal{
    void eat(){
        System.out.println("biscut");

    }

}
public class Main {
    public static void main(String[] args) {
        Dog d1 =new Dog();
        d1.eat();

        System.out.printf("good");
    }
}