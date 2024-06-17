public class This {

    //3rd

    This(){
        System.out.println(this);
    }

    // this ke ander address store hota hai reference

    public static void main(String[] args) {
        This t=new This();
        This t2=new This();
    }
}
