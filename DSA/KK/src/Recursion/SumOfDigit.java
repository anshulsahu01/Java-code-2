package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        int ans=digtiadd(5152);
        System.out.println(ans);

    }

    public static int digtiadd(int n){

        if(n%10==n){
            return n;
        }
        return (n%10)+digtiadd(n/10);
    }
}
