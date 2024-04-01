package com.BJSHUB;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class D {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
//        al.add(40);
//        al.add(10);
//        al.add(50);
//        al.add(25);
//
//        System.out.println(al);
//
//        Collections.sort(al);
//        System.out.println(al);

        ArrayDeque ad=new ArrayDeque(); 
        ad.add(40);
        ad.add(10);
        ad.add(50);
        ad.add(25);

        al.addAll(ad);


        System.out.println(ad);


        Collections.sort(al);
        System.out.println(al);
    }
}
