abstract class Human{
    abstract void study();

    void teacher(){
        System.out.println("teach maths");
    }

}
class Man extends Human{
    @Override
    void study() {
        System.out.println("can read an write");
    }
}


public class A {
    public static void main(String[] args) {

        Man m =new Man();
        m.study();
        m.teacher();
    }
}
