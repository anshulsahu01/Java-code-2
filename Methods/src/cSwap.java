package Methods.src;

public class cSwap {
    public static void main(String[] agrs) {

        swap(10, 15);
    }

    static void swap(int a, int b) {
//        int a;
//        int b;

        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("value of a = " + a + "value of b= " + b);


    }
}
