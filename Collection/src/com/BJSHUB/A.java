package com.BJSHUB;

import java.util.ArrayList;

public class A {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        System.out.println(a1);

        a1.add(1,13);
        System.out.println(a1);
        a1.add(55);
        System.out.println(a1);


        ArrayList a2=new ArrayList();
        a2.add(60);
        a2.add(70);
        a2.add(80);

        System.out.println(a2);

        a1.addAll(a2);
        System.out.println(a1);

        a1.addAll(1,a2);
        System.out.println(a1);


        System.out.println(a2.size());

        ArrayList a3= (ArrayList) a2.clone();
        System.out.println(a3);

        System.out.println( a2.contains(60));

//        System.out.println( a2.remove(new Integer(60)));

        System.out.println(a2.equals(a3));
        System.out.println(a2.equals(a1));

        System.out.println(a2.get(1));

        a2.add(1,33);
        System.out.println(a2);

        a2.set(1,55);// set we  you for replace the place ex:- password
        System.out.println(a2);


        /* output
[10, 20, 30, 40, 50]
[10, 13, 20, 30, 40, 50]
[10, 13, 20, 30, 40, 50, 55]*/
    }
}
