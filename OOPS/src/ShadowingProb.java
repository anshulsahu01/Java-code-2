public class ShadowingProb {

    public static void main(String[] args){

        Dog2 d1=new Dog2();
        d1.setdata("bruno", "black" ,5000);


        System.out.println(d1.getname());
        System.out.println(d1.getcolour());
        System.out.println(d1.getcost());


    }
}
class Dog2 {
    private String name;
    private String colour;

    private int cost;

    void setdata(String name, String colour, int cost) {

       this. name = name;
        this. colour = colour;
        this.cost = cost;

    }
    /*
    Before using this
    out put agr this ka use ni karinge to
 null
null
0

After using this
bruno
black
5000



*/

    String getname() {
        return name;
    }

    String getcolour() {
        return colour;
    }

    int getcost() {
        return cost;
    }
}

