package Recursion;

public class EToN {

    //print n to 1
    static void ntoOne(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
         ntoOne(n-1);

    }


    //1 to n
    static void OneTon(int n){
        if (n==0){
            return;
        }
        OneTon(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        ntoOne(5);
        OneTon(6);

    }
}
