

// Polymorphism propertie 1st is mai code ka size km ni hota


class plan{
    void fly(){
        System.out.println("1 in the sky");
    }
    void land(){
        System.out.printf("in the airport");
    }
}
class CargoPlane extends plan{
    void fly(){
        System.out.printf("2 in the  top of sky");
    }
    void land(){
        System.out.printf("in the army base");
    }
    void use(){

            System.out.printf("for public");

    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        plan p =new plan();
        CargoPlane c=new CargoPlane();



        plan ref;
        ref=p;
        ref.fly();
        ref=c;
        ref.fly();




    }
}