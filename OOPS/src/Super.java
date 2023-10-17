import static java.awt.Color.black;
/*
Constructor creation super method 

 */
public class Super {
    public static void main(String args[]){

        dog3 d1=new dog3( "bruno ", "black" ,5000);

        System.out.println(d1.getname());
        System.out.println(d1.getcolor());
        System.out.println(d1.getcost());


    }
}
class dog3{
    private String name;
    private String color;
    private int cost;
    dog3(String name,String color,int cost){
//        supper();
        this.name=name;
        this.color=color;
        this.cost=cost;
    }
    String getname() {
        return name;
    }String getcolor() {
        return color;
    }int getcost() {
        return cost;
    }
}
