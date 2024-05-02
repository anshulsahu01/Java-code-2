package Recursion;

public class GaddoneToN {
    public static void main(String[] args) {
        int n=3;
        System.out.println(sum(n));

    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int sum=n+sum(n-1);
        return sum;

    }
}
