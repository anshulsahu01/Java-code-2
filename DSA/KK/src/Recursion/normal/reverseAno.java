package Recursion.normal;

public class reverseAno {
    public static void main(String[] args) {
        int n=212;
        System.out.println(reverse(n));

    }
    public static int reverse(int n){
        if (n==0){
            return 1;
        }
        int rev = n%10;
        reverse(n/10);
        return rev;
    }
}
