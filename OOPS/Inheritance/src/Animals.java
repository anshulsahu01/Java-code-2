
class animal{
    void eat(){
        System.out.println(" eats every day");
    }
    void sleep(){
        System.out.println("sleep at night ");
    }
    void breath(){
        System.out.println("breathe ");
    }

}

class tiger extends animal{
    void eat(){
        System.out.println("tiger eats meat");
    }
}
class deer extends animal{
    void eat(){
        System.out.println("deer eats grasses,sedges ");
    }
}
class monkey extends animal{
    void eat(){
        System.out.println("monkey eats fruits");
    }
}

public class Animals {

    public static void main(String args[]){

        monkey m= new monkey();
        deer d=new deer();
        tiger t= new tiger();

        t.eat();
        t.breath();
        t.sleep();
        System.out.println("############");

        d.eat();
        d.breath();
        d.sleep();
        System.out.println("@@@@@@@@@@@@@");
        m.eat();
        m.breath();
        m.sleep();
        System.out.println("///////////");
        System.out.println("///////////");


    }

}
