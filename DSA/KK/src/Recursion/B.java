package Recursion;

//print the numbers form 1 to 5

public class B {
    

    static void findnum(int n){
        System.out.println(n);
        findnum1(2);
    } static void findnum1(int n){
        System.out.println(n);
        findnum2(3);
    } static void findnum2(int n){
        System.out.println(n);
        findnum3(4);
    } static void findnum3(int n){
        System.out.println(n);
//        findnum5(6);
    } static void findnum4(int n){
        System.out.println(n);
        findnum(2);
    }


    public static void main(String[] args) {
        findnum(1);
    }
}
