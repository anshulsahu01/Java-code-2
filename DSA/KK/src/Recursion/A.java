package Recursion;

//it will print 5 times hey

import java.sql.SQLOutput;

public class A {
    static void msg(){
        System.out.println("hey recursion");
        msg1();
    } static void msg1(){
        System.out.println("hey recursion");
        msg2();
    } static void msg2(){
        System.out.println("hey recursion");
        msg3();
    } static void msg3(){
        System.out.println("hey recursion");
        msg4();
    } static void msg4(){
        System.out.println("hey recursion");
//        msg();
    }
    public static void main(String[] args) {
        msg();

    }
}
