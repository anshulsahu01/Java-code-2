
//encapsulation normal program

public class Encapsulationdog {

    public static void main(String[] args){

        Dog d=new Dog();
        d.setdata("bruno", "black" ,5000);


        System.out.println(d.getname());
        System.out.println(d.getcolour());
        System.out.println(d.getcost());


    }
}
class Dog{
    private  String name;
    private  String colour;

    private  int cost;

    void setdata(String x,String y,int z){

        name =x;
        colour =y;
        cost = z;

    }
    String getname(){
        return name;
    }String getcolour(){
        return colour;
    }int getcost(){
        return cost;
    }

}
