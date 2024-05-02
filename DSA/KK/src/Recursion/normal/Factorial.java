package Recursion.normal;

public class Factorial {
    public static void main(String[] args) {
        int i=5;
        System.out.println(fac(i));
    }
    static int fac(int i){
        if (i==0){
            return 0;
        }
        return fac(i-2)+ fac(i-1);
    }
}
