import java.io.*;
interface Vehical {
    final  String start ="started";
    void vehilcalno();
    String name();
}
class TwoWheeler implements Vehical{

   @Override
   public String name(){
        return "Hero" ;
    }
    public void vehilcalno() {
        System.out.println(2);
    }
    void heroHonda(){
        System.out.println("price 26k");
    }

    public static void main(String[] args) {
        TwoWheeler tw =new TwoWheeler();
        tw.heroHonda();
        tw.vehilcalno();
        tw.name();

    }


}

