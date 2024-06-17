
class Human{
    void eat(){
        System.out.println("veg");
    }
}
class student extends Human{
    void study(){
        System.out.println("can study");
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        student s=new student();
        s.study();
        s.eat();
    }
}