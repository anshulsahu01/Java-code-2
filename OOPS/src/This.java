public class This {
   public static void main(String args[]){
       dog4 d4=new dog4( );
       System.out.println(d4.getname());
       System.out.println(d4.getcolor());
       System.out.println(d4.getcost());
   }
}
class dog4{
    private String name;
    private String color;
    private int cost;
    dog4(String name , String color, int cost){
        //super();
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
    dog4(){
        this("bruno", "white",400);
        name="jimi";
        color ="brown";
    }
    /*dog4(){
        this();
        name="jimi";  //recursive
        color ="brown";
    }

     */
}
